.data

Priceprompt: .asciiz "Enter the price of your meal: "
Verifymessage: .asciiz  "Is your meal price correct? Please type yes or no. "
verifyInput: .space 4 #space is like an array, 3 is max characters







.text

#Ask for price
li $v0, 4
la $a0, Priceprompt
syscall 