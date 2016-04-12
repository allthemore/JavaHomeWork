package week1;

import java.util.Scanner;

/**
 * 13) Даны три числа A,B,C. Увеличить числа в два
 * раза, если A+B+C>0, в противном случае заменить
 * на нули.
 */
public class Additional_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A");
        int A = sc.nextInt();
        System.out.println("Input B");
        int B = sc.nextInt();
        System.out.println("Input C");
        int C = sc.nextInt();
        if (A + B + C > 0){
            A = A * 2;
            B = B * 2;
            C = C * 2;
        } else {
            A = 0;
            B = 0;
            C = 0;
        }
        System.out.println("A = " + A + "\n" + "B = " + B + "\n" + "C = " + C);
    }
}
