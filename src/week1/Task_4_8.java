package week1;

import java.util.Scanner;

/**
 * 	4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 *  124    4    -   true
 *  1456   567  -   false
 *  1      2    -   false
 *  18     98   -   true
 */
public class Task_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = sc.nextInt() % 10;
        System.out.println("Input second number");
        int secondNumber = sc.nextInt() % 10;
        boolean firstIsBigger = firstNumber >= secondNumber;
        System.out.println(firstIsBigger);
    }
}
