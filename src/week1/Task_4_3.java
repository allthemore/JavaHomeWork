package week1;

import java.util.Scanner;

/**
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int number = sc.nextInt();
        if (number % 7 == 0){
            System.out.println("Doubled number: " + number*2);
        }

    }
}
