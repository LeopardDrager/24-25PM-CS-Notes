# found this online and felt it was fair for me to use it its this dictionairy  
from gpiozero import LED
import time

MORSE_CODE_DICT = { 'A':'.-', 'B':'-...',
                    'C':'-.-.', 'D':'-..', 'E':'.',
                    'F':'..-.', 'G':'--.', 'H':'....',
                    'I':'..', 'J':'.---', 'K':'-.-',
                    'L':'.-..', 'M':'--', 'N':'-.',
                    'O':'---', 'P':'.--.', 'Q':'--.-',
                    'R':'.-.', 'S':'...', 'T':'-',
                    'U':'..-', 'V':'...-', 'W':'.--',
                    'X':'-..-', 'Y':'-.--', 'Z':'--..',
                    '1':'.----', '2':'..---', '3':'...--',
                    '4':'....-', '5':'.....', '6':'-....',
                    '7':'--...', '8':'---..', '9':'----.',
                    '0':'-----', ', ':'--..--', '.':'.-.-.-',
                    '?':'..--..', '/':'-..-.', '-':'-....-',
                    '(':'-.--.', ')':'-.--.-'}

led = LED(17)
def dotLight():
    led.on()
    time.sleep(.25)
    led.off()
    time.sleep(.25)

def dashLight():
    led.on()
    time.sleep(1)
    led.off()
    time.sleep(.25)

 

def encrypt(message):
    spacer = ''
    for letter in message:
        if letter != ' ':
            #will encrypt it
            cipher += MORSE_CODE_DICT[letter] + ' '
        else:
            cipher += ' '
            
    return cipher

def blink_the_morse(morse_code):
    for symbol in morse_code:
        if symbol == '.':
            dotLight()
        elif symbol == '-':
            dashLight()
        elif symbol == ' ':
            time.sleep(.5)
    



def main():
    message = input("Please enter the word you like to convert!")
    morse = encrypt(message)
    print("Morse Code:", morse)
    blink_the_morse(morse)
    
    
if __name__ == "__main__":
    main()    