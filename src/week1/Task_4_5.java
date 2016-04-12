package week1;

import java.util.Scanner;

/**
 * Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 * Если второе больше, то выводим сумму.
 */
public class Task_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number");
        int secondNumber = sc.nextInt();
        if(firstNumber > secondNumber){
            System.out.println("firstNumber - secondNumber = " + (firstNumber - secondNumber));
        } else {
            System.out.println("firstNumber + secondNumber = " + (firstNumber + secondNumber));
        }
    }
}
