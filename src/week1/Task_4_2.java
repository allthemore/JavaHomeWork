package week1;

import java.util.Scanner;

/**
 * 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class Task_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number");
        int secondNumber = sc.nextInt();
        System.out.println("Input third number");
        int thirdNumber = sc.nextInt();
        int maxNumber = Math.max(firstNumber, secondNumber);
        maxNumber = Math.max(maxNumber, thirdNumber);
        int minNumber = Math.min(firstNumber, secondNumber);
        minNumber = Math.min(minNumber, thirdNumber);

        System.out.println("Maximum Number: " + maxNumber + "\n" + "Minimum Number: " + minNumber);
    }
}
