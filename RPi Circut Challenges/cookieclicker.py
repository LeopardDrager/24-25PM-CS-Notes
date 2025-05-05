from gpiozero import RGBLED, Button
from colorzero import Color  # using this as it makes my job easier
import time

# Creating constants as I am away from the pi right now 
bNumP1 = 18        # player 1 score button
bPowerP1 = 3      # player 1 power-up button
bNumP2 = 23        # player 2 score button
bPowerP2 = 5      # player 2 power-up button
redPin = 17
greenPin = 27
bluePin = 22

# Setup
led = RGBLED(red=redPin, green=greenPin, blue=bluePin) 
# did this so if red is plugged in the wrong slot it just won't work rather than crashing out 
# also so I can just change the {color}Pin value

button1 = Button(bNumP1)         # player 1 scoring button
button2 = Button(bNumP2)         # player 2 scoring button
power_button1 = Button(bPowerP1) # player 1 power-up button
power_button2 = Button(bPowerP2) # player 2 power-up button

playerOneScore = 0
playerTwoScore = 0
powerUp1 = False
powerUp2 = False
gameOver = False

# player 1 pressing potential options/actions that could happen
def player1_pressed():
    global playerOneScore, powerUp1, gameOver
    if gameOver:
        return

    playerOneScore += 1
    if playerOneScore >= 10 and not powerUp1:
        powerUp1 = True

    if playerOneScore >= 100:
        print("Player 1 wins! Player 2 scored:", playerTwoScore)
        gameOver = True

    update_led()
    print_scores()

# player 2 pressing potential options/actions that could happen
def player2_pressed():
    global playerTwoScore, powerUp2, gameOver
    if gameOver:
        return

    playerTwoScore += 1
    if playerTwoScore >= 10 and not powerUp2:
        powerUp2 = True

    if playerTwoScore >= 100:
        print("Player 2 wins! Player 1 scored:", playerOneScore)
        gameOver = True

    update_led()
    print_scores()

# player 1 activating power-up
def player1_activate_powerup():
    global playerOneScore, playerTwoScore, powerUp1
    if powerUp1 and not gameOver:
        playerOneScore = max(0, playerOneScore - 5)
        playerTwoScore = max(0, playerTwoScore - 10)
        powerUp1 = False
        update_led()
        print("Player 1 used power-up!")
        print_scores()

# player 2 activating power-up
def player2_activate_powerup():
    global playerTwoScore, playerOneScore, powerUp2
    if powerUp2 and not gameOver:
        playerTwoScore = max(0, playerTwoScore - 5)
        playerOneScore = max(0, playerOneScore - 10)
        powerUp2 = False
        update_led()
        print("Player 2 used power-up!")
        print_scores()

# LED color updates
def update_led():
    if powerUp1 or powerUp2:
        led.color = Color('yellow') # I did a different color so no confusion can be caused
    elif playerOneScore > playerTwoScore:
        led.color = Color('red')
    elif playerTwoScore > playerOneScore:
        led.color = Color('blue')
    else:
        led.color = Color('green')

# Score display
def print_scores():
    print(f"Player 1: {playerOneScore} \t Player 2: {playerTwoScore}", flush=True)

# Hooking button events
button1.when_pressed = player1_pressed
button2.when_pressed = player2_pressed
power_button1.when_pressed = player1_activate_powerup
power_button2.when_pressed = player2_activate_powerup

print("Game started! First to 100 wins.")  # Keeps the program running
print_scores()

while not gameOver:
    time.sleep(0.1)  # prevents user from just holding down
