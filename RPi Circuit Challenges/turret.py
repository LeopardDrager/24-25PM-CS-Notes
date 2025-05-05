import RPi.GPIO as GPIO
from gpiozero import RGBLED, Buzzer, AngularServo
from colorzero import Color #color class I used this in cookie clicker, just makes life easier.
import time
import concurrent.futures

# Pin config for ease or change due to having to possible rewiring.
TRIG = 23
ECHO = 24
LASER = 16
RED = 17
GREEN = 27
BLUE = 22
BUZZER_PIN = 25
SERVO_PIN = 18


GPIO.setmode(GPIO.BCM)
GPIO.setup(TRIG, GPIO.OUT)
GPIO.setup(ECHO, GPIO.IN)
GPIO.setup(LASER, GPIO.OUT)
#I used gpt to help me with the laser I thought of the idea, but had it help me implement it.


led = RGBLED(RED, GREEN, BLUE, active_high=False)


buzzer = Buzzer(BUZZER_PIN)
servo = AngularServo(
    SERVO_PIN, min_angle=0, max_angle=180,
    min_pulse_width=0.0005, max_pulse_width=0.0025
) #stole this from the circut code.

#calculate the distance 
def pulseIn(pin, level, timeout):
    t0 = time.time()
    while GPIO.input(pin) != level:
        if (time.time() - t0) > timeout * 1e-6:
            return 0
    t0 = time.time()
    while GPIO.input(pin) == level:
        if (time.time() - t0) > timeout * 1e-6:
            return 0
    return (time.time() - t0) * 1e6  #also stole this from the one circut code, why reinvent the wheel. I found this would work better when compared to the distance sensor class.


def getSonar():
    GPIO.output(TRIG, GPIO.HIGH)
    time.sleep(0.00001)
    GPIO.output(TRIG, GPIO.LOW)
    pingTime = pulseIn(ECHO, GPIO.HIGH, 30000)
    return pingTime * 340.0 / 2.0 / 10000.0  # cm
#also stole this from the circut code, cause why not, it works.

#what to do based of the distance
def respond(distance):
    if 2.5 <= distance <= 3.0:  # 250-300 cm
        led.color = Color('yellow')
    elif 2.0 <= distance < 2.5:  # 200-250 cm
        led.color = Color('yellow')
    elif 1.0 <= distance < 2.0:  # 100-200 cm
        led.color = Color('orange')
    elif 0.3 <= distance < 1.0:  #  30-100cm
        led.color = Color('red')
        time.sleep(0.3)
    elif 0.16 <= distance < 0.29:  #  16-29cm
        led.color = Color('red')
        buzzer.on()
        time.sleep(0.3)
        buzzer.off()
    elif 0.01 < distance < 0.15:  # 1-15 cm
        led.color = Color('red')
        GPIO.output(LASER, GPIO.HIGH)
        buzzer.on()
        time.sleep(0.3)
        buzzer.off()
        GPIO.output(LASER, GPIO.LOW)
    elif 0 < distance <= 0.01:  # ~1 cm or closer I found the sensor would sometimes default to 0 if to far or bad data so created condition to just toss it out. Also its imposible to be closer than 1cm due to the design of ultrasonic.
        led.color = Color('blue')
        time.sleep(0.5)
        buzzer.off()
    else:
        led.color = Color("green")

#convert the distance to something usable...like stupid british m.
def distanceCheck():
    while True:
        dist_cm = getSonar()
        dist_m = dist_cm / 100
        respond(dist_m)#passes it into the what to do based on distance function.
        time.sleep(0.1)

#scanning and tracking
def trackTarget():
    step = 5
    direction = 1
    angle = 0
    lock_time = 2  #how long it stays looking at the target.
    last_lock_time = 0

    while True:
        # don't move if its 'locked in'
        if time.time() - last_lock_time < lock_time:
            time.sleep(0.1)
            continue

        servo.angle = angle
        time.sleep(0.15)

        dist = getSonar() / 100  #converting to meters here because the before function goes into the respond function.
        if dist < 0.15:

            best_angle = angle
            best_dist = dist

            for delta in [-5, 0, 5]: #for doing quick sweep for tracking incase target moves left or right
                sweep_angle = max(0, min(180, angle + delta))
                servo.angle = sweep_angle
                time.sleep(0.15)
                sweep_dist = getSonar() / 100
                
                if 0 < sweep_dist < best_dist - 0.01:  # only change if clearly closer
                        best_dist = sweep_dist
                        best_angle = sweep_angle
            servo.angle = best_angle
            GPIO.output(LASER, GPIO.HIGH) #turns on laser for tracking
            last_lock_time = time.time()
            continue  # Skip rest of loop
        else:
            GPIO.output(LASER,GPIO.LOW)

        # Continue normal patrol sweep
        angle += step * direction
        if angle >= 180:
            angle = 180
            direction = -1
        elif angle <= 0:
            angle = 0
            direction = 1

        time.sleep(0.1)


# === Main ===
def main():
    try:
        with concurrent.futures.ThreadPoolExecutor() as executor: #from the r2d2 project I used this
            executor.submit(trackTarget)
            executor.submit(distanceCheck)
    finally:
        GPIO.cleanup()

if __name__ == "__main__":
    main()