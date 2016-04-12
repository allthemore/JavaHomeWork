package week3;

import week3.utils.TextUtils;

import java.util.Scanner;

/**
  3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
 */
public class Task_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = TextUtils.inputTextFromConsole(sc);

        String maxWord = TextUtils.longestWord(text);

        System.out.println("Longest word in the text: " + maxWord);

    }

}
