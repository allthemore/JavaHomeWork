package week1;

import java.util.Scanner;

/**
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 * лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class Additional_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();
        System.out.println("Input c");
        int c = sc.nextInt();
        if (a * a == b * b + c * c && a > 0 && b > 0 && c > 0){
            System.out.println("This is a right-angle triangle");
        } else {
            System.out.println("This is not a right-angle triangle");
        }
    }
}
