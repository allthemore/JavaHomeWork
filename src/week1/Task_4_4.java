package week1;

import java.util.Scanner;

/**
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number of float type");
        double number = sc.nextFloat();
        boolean checkValue = number >= 0 && number <=1;
        if (checkValue){
            System.out.println("Your entered the number in range [0...1]");
        } else System.out.println("Your entered the number out of range [0...1]");
    }
}
