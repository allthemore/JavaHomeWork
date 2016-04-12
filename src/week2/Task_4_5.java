package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Task_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range from console
        int range = ArrayUtils.inputArrayRange(sc);

//        Generate and print array
        int[] mas = ArrayUtils.genRandomMasEvenAndOddNum(size, range);
        ArrayUtils.printArr(mas);
    }

}
