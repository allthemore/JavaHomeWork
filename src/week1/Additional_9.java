package week1;

import java.util.Scanner;

/**
 * 9) Написать программу вычисления идеального веса пользователя (рост-
 * 100). Выдать рекомендации о необходимости поправиться либо поху-
 * деть.
 */
public class Additional_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        int height = sc.nextInt();
        System.out.println("Enter your weight in kg");
        int weight = sc.nextInt();
        int idealWeight = height - 100;
        if (weight == idealWeight){
            System.out.println("You have ideal weight.");
        } else if (weight < idealWeight) {
            System.out.printf("You need to gain %d kg to ideal weight.", (idealWeight - weight));
        } else if (weight > idealWeight) {
            System.out.printf("You need to drop %d kg to ideal weight.", (weight - idealWeight));
        }
    }
}
