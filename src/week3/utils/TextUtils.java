package week3.utils;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created on 27/03/2016.
 */
public class TextUtils {
    public static String inputTextFromConsole(Scanner sc) {
        System.out.println("Enter text: ");
        return sc.nextLine().toLowerCase().trim();
    }


    public static String onlyLetters(String str) {
        str = str.trim();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                res += str.charAt(i);
            }
        }
        return res;
    }


    public static int[] countConsecutive(String text, char a) {
        int maxSymbols = 0;
        int tmpMax = 0;
        int startingIndex = 0;
        int tmpStart = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == a) {
                tmpMax++;
                if (tmpMax == 1) {
                    tmpStart = i;
                }
            } else {
                tmpMax = 0;
                tmpStart = 0;
            }
            if (tmpMax > maxSymbols) {
                maxSymbols = tmpMax;
                startingIndex = tmpStart;

            }
        }

        int[] res = new int[2];
        res[0] = startingIndex + 1;
        res[1] = startingIndex + maxSymbols;

        return res;
    }

    public static String longestWord(String text) {
        int maxSymbols = 0;
        int tmpMaxIndex = 0;
        String tmpMaxWord = "";
        String maxWord = "";

        // Replace to a " " all symbols that are "," "." "(" etc
        text = normalise(text);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                tmpMaxIndex++;
                tmpMaxWord += text.charAt(i);
            } else {
                tmpMaxIndex = 0;
                tmpMaxWord = "";
            }

            if (tmpMaxIndex > maxSymbols) {
                maxSymbols = tmpMaxIndex;
                maxWord = tmpMaxWord;
            }
        }

        return maxWord;
    }

    public static String normalise(String text) {
        String normalised = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                normalised += text.charAt(i);
            } else {
                normalised += " ";
            }
        }
        return normalised;
    }

    public static String capitalise(String text) {
        char[] chArray = text.toCharArray();
        chArray[0] = Character.toUpperCase(chArray[0]);

        for (int i = 1; i < chArray.length; i++) {
            if (text.charAt(i - 1) == ' ') {
                chArray[i] = Character.toUpperCase(chArray[i]);
            }

        }
        text = new String(chArray);
        return text;
    }

}
