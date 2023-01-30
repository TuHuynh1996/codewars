package org.codewars.phone;

public class Kata {

    /**
     * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
     *
     * @Example Kata.createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }) // => returns "(123) 456-7890"
     * <p>
     * The returned format must be correct in order to complete this challenge.
     * <p>
     * Don't forget the space after the closing parentheses!
     */
    public static String createPhoneNumber(int[] numbers) {

        int[] i = numbers;
        return "("+i[0]+i[1]+i[2]+") " + i[3]+i[4]+i[5]+"-"+i[6]+i[7]+i[8]+i[9];
    }
}
