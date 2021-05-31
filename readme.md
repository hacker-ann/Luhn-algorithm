# Luhn algorithm
***
This is a Java project for credit card number validation.

## General Information 
Credit card numbers follow certain patterns and Luhn Algorithm helps to determine whether that card is valid or invalid.
A credit card number must have between 13 and 16 digits. It must start with: 4 for Visa cards, 5 for Master cards, 37 for American Express cards,  6 for Discover cards.
Here are the Luhn steps which are used to validate the credit card number:
- Step 1. Double every second digit (excluding the check digit), from the rightmost and moving left. If the result of this doubling operation is greater than 9 replace it by the sum of its digits.
- Step 2: Add all single-digit numbers.
- Step 3: Add the un-doubled digits in the odd places from right to left.
If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; otherwise it is not valid.

If you need more information how does the Luhn Algorithm work please take a look at this [Luhn algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm).

## Features 
This project includes:
- reading the card number entered by the user on the keyboard
- card number verification based on Luhn algorithm

## Technologies Used
- Java - version 10.0.2

## Setup

###### 1. Clone this reposidory to your desktop

###### 2. Run the project in an IDE
 
If you want to run the project in an IDE, such as IntelliJ go to the File menu and choose:
```
1. File -> Open
2. In the dialog that opens, select the directory that contains the desired source code.
3. Click OK.
4. To run the program, click the class with the main method (Main) and select the Run> Run option 
   or press the Alt + Shift + F10 combination and select the Run option from the list.
```

## Project Status
Project is complete.



