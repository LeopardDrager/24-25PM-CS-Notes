from gpiozero import LED
import time
rLed = LED(22)
yLed = LED(27)
gLed = LED(17)


def main():
    while True:
        gLed.on()
        time.sleep(5)
        gLed.off()
        yLed.on()
        time.sleep(3)
        yLed.off()
        rLed.on()
        time.sleep(2)
        rLed.off
        
        
        
if __name__ == "__main__":
    main()   
    