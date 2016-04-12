package week1;

import java.util.Scanner;

/**
 * Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Task_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number");
        int secondNumber = sc.nextInt();
        if (firstNumber + secondNumber >= 11 && firstNumber + secondNumber <= 19){
            System.out.println("firstNumber + secondNumber = " + (firstNumber + secondNumber));
        }
    }
}
