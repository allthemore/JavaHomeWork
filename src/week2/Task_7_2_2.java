package week2;

import java.util.Scanner;

/**
 * 	2.2 Проверить или является число простым
 */
public class Task_7_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter number to check from console
        System.out.println("Enter a number to check: ");
        int a = sc.nextInt();

//        We assume the number is prime unless we find a divisor other than 1 and the number itself
        boolean aIsPrime = true;

//        0 and 1 are not prime numbers, we need to exclude them, all other numbers will be checked
        if (a >= 2) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    int b = a / i;
                    System.out.println("Your number is not prime: ");
                    System.out.printf("%1$d / %2$d = %3$d", a, i, b);
                    System.out.println();
                    aIsPrime = false;
                    break;
                }
            }
        } else {
            aIsPrime = false;
        }
        System.out.printf("Number is prime: %b", aIsPrime);
        System.out.println();
    }
}
