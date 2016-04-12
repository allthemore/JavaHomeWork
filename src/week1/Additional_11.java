package week1;

import java.util.Scanner;

/**
 * 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 * добавляет к нему слово "копейка" в правильной форме. Например, 1
 * копейка, 5 копеек, 42 копейки .
 */
public class Additional_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество копеек от 1 до 99");
        int cents = sc.nextInt();
        String ending1 = "копейка";
        String ending2 = "копейки";
        String ending3 = "копеек";
//        1, 21, 31 ... копейка (кроме 11 -- копеек)
        if (cents % 10 == 1 && cents / 10 != 1){
            System.out.println(cents + " " + ending1);
//        2, 3, 4, 22, 23, 24, 32, 33, 34 ... копейки (кроме 12, 13, 14 -- копееек)
        } else if ((cents % 10 == 2 || cents % 10 == 3 || cents % 10 == 4) && cents / 10 != 1) {
            System.out.println(cents + " " + ending2);
//       5-10, 11-20, 25-30, 35-40 ... копеек
        } else {
            System.out.println(cents + " " + ending3);
        }
    }
}
