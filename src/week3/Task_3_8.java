package week3;

import week3.utils.TextUtils;

import java.util.Scanner;

/**
   3.8. Верхний регистр.

   Напишите программу, которая позволяет пользователю ввести в консоли строку,
   переводит первый символ слов в верхний регистр и результат выводит в консоль

   Вход:
   иван васильевич

   Выход:
   Иван Васильевич
 */
public class Task_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = TextUtils.inputTextFromConsole(sc);

        String capitalised = TextUtils.capitalise(text);

        System.out.println(capitalised);
    }
}
