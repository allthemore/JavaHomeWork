package week2;

import java.util.Scanner;

/**
 * 2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */
public class Task_7_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter a string from console
        System.out.println("Enter some text:");
        String a = sc.nextLine();

//        Enter a symbol from console
        System.out.println("Enter a symbol to find");
        String  ch = sc.nextLine();

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).equals(ch)) {
                count++;
            }
        }
        System.out.println();
        System.out.printf("Symbol '%1$s' has %2$d occurrences in the text", ch, count);
    }
}
