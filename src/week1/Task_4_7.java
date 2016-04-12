package week1;

import java.util.Scanner;

/**
 * 4.7. Вводим два числа, если одно из них делится на другое без остатка,
 * то выводим тру и показываем результат деления (целую часть от деления  и остачу)
 * в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class Task_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = sc.nextInt();
        System.out.println("Input second number");
        int secondNumber = sc.nextInt();
        boolean noRemainder = firstNumber % secondNumber == 0;
        System.out.println(String.valueOf(noRemainder) + "\n" + "Division Result: " + (firstNumber / secondNumber) +
                           "\n" + "Division Remainder: " + (firstNumber % secondNumber));
    }
}
