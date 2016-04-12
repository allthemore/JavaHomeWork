package week1;

import java.util.Scanner;

/**
 * 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 * времени года. Если пользователь введет недопустимое число, программа
 * должна выдать сообщение об ошибке.
 */
public class Additional_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 1 to 12: ");
        int month = sc.nextInt();
        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5){
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >=9 && month <= 11){
            System.out.println("Autumn");
        } else if (month < 1 || month > 12){
            System.out.println("You entered a wrong number, the number must be from 1 to 12");
        }
    }
}
