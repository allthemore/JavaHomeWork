package week1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 5.2. Вычислить факториал числа.
 */
public class Task_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");

        int a = sc.nextInt();

        // 0! and 1! equals 1; for other numbers the result will be calculated below
        BigInteger result = BigInteger.valueOf(1);

        if (a > 1) {
            for (int i = 1; i <= a; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.printf("%1$d! = %2$,d", a, result);

        } else if (a < 0) {
            System.out.println("Number must be >=0");
        }
    }
}
