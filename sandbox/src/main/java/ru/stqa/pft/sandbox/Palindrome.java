package ru.stqa.pft.sandbox;

import java.util.Scanner;

/**
 * Palindrome class
 */
public class Palindrome {

    /**
     * classic palindrome check method
     * @param word String
     * @return boolean
     */
    public static boolean isPalindrome(String word) {
        int len = word.length();

        for (int i = 0; i < (len / 2); i++) {
            if (word.charAt(i) != word.charAt((len - 1) - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * word reversal method
     * Bad decision, because the complexity of the algorithm increases
     * @param word String
     * @return boolean
     */
    public static boolean isPalindromeReversed(String word) {

        return word.equals(new StringBuilder(word).reverse().toString());

    }


    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Input word: ");

        String word = scr.nextLine();

        boolean reversedMethod = isPalindromeReversed(word);
        boolean classicMethod = isPalindrome(word);

        System.out.printf("Reversed method: %s\nClassic method: %s", reversedMethod, classicMethod);

    }
}
