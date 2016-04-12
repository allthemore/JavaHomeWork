package week3;

import week2.method.ArrayUtils;
import week3.utils.TextUtils;

import java.util.Scanner;

/**
   	3.6. Нули

   Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

   Вход:
   10001101001

   Выход:
   (2,4) - цепочка нулей
   (5,6) - цепочка единиц
 */
public class Task_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = TextUtils.inputTextFromConsole(sc);

        int[] countZeros = TextUtils.countConsecutive(text, '0');
        int[] countOnes = TextUtils.countConsecutive(text, '1');

        System.out.print("Цепочка нулей: ");
        ArrayUtils.printArr(countZeros);
        System.out.print("Цепочка единиц: ");
        ArrayUtils.printArr(countOnes);
    }
}
