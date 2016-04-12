package week3;

import java.util.Scanner;

import week3.utils.TextUtils;

/**
 3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class Task_3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = TextUtils.inputTextFromConsole(sc);

        text = TextUtils.onlyLetters(text);

        // Compare 2 parts of the text
        boolean palindrome = false;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }

        System.out.println();

        // Check if the first part has the same characters as the second one in reversed order
        if (palindrome) {
            System.out.println("The text is a palindrome");
        } else {
            System.out.println("The text is not a palindrome");
        }
    }
}
