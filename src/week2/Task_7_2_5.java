package week2;

import java.util.Scanner;

/**
 * 2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
 */
public class Task_7_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter a string from console
        System.out.println("Enter some text:");
        String a = sc.nextLine();

        String a1 = a.replace('a', '@');
        System.out.println(a1);
    }
}
