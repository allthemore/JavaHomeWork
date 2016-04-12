package week1;

import java.util.Scanner;

/**
 * 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных
 */
public class Additional_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();
        System.out.println("Input c");
        int c = sc.nextInt();
        if(a == b || a == c || b == c){
            System.out.println("There are two equal numbers available");
        }
    }
}
