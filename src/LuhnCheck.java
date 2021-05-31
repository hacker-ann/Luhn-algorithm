import java.util.Scanner;

public class LuhnCheck {

    public LuhnCheck() {
    }

    /* Credit card number must have between 13 and 16 digits.
    It must start with: 4 for Visa cards, 5 for Master cards, 37 for American Express cards,  6 for Discover cards
    If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; otherwise it is not valid.*/
    public static boolean luhnCheck(long cardNumber) {
        return (numberOfDigits(cardNumber) >= 13 && numberOfDigits(cardNumber) <= 16 &&
                (prefixCheck(cardNumber, 4) ||
                        prefixCheck(cardNumber, 5) ||
                        prefixCheck(cardNumber, 37) ||
                        prefixCheck(cardNumber, 6)) &&
                ((sumOfDoubledDigits(cardNumber) + sumOfDigitsInOddPlace(cardNumber)) % 10) == 0);
    }

    /* Double every second digit (excluding the check digit), from the rightmost and moving left.
    If the result of this doubling operation is greater than 9 replace it by the sum of its digits.
    Add all single-digit numbers.*/
    public static int sumOfDoubledDigits(long cardNumber) {
        int sum = 0;
        String numToString = Long.toString(cardNumber);
        for (int i = numberOfDigits(cardNumber) - 2; i >= 0; i -= 2) {
            sum += getSingleDigits(Integer.parseInt(Character.toString(numToString.charAt(i))) * 2);
        }
        return sum;
    }

    //Return this number if it is greater than 9, otherwise return the sum of the two digits
    public static int getSingleDigits(int cardNumber) {
        if (cardNumber <= 9)
            return cardNumber;
        return cardNumber / 10 % 10 + cardNumber % 10;

    }

    //Add the un-doubled digits in the odd places from right to left
    public static int sumOfDigitsInOddPlace(long cardNumber) {
        int sum = 0;
        String numToString = Long.toString(cardNumber);
        for (int i = numberOfDigits(cardNumber) - 1; i >= 0; i -= 2) {
            sum += getSingleDigits(Integer.parseInt(Character.toString(numToString.charAt(i))));
        }
        return sum;
    }

    //Return true if the digit is a prefix for card number
    public static boolean prefixCheck(long cardNumber, int digit) {

        return getPrefix(cardNumber, numberOfDigits(digit)) == digit;
    }

    //Return the number of digits
    public static int numberOfDigits(long d) {
        String cardNumber = Long.toString(d);
        return cardNumber.length();
    }

    //Return the first j number of digits from card number. If the number of digits in number is less than j, return number.
    public static long getPrefix(long cardNumber, int j) {
        if (numberOfDigits(cardNumber) < j) {
            return cardNumber;
        }
        String numToString = Long.toString(cardNumber);
        return Long.parseLong(numToString.substring(0, j));
    }
}
