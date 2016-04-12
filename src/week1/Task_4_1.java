package week1;

import java.util.Scanner;

/**
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 * Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class Task_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input current time (hours)");
        int currentTime = sc.nextInt();
        if (currentTime >= 9 && currentTime <= 18){
            System.out.println("I'm at work");
        } else {
            System.out.println("I'm resting");
        }

    }
}
