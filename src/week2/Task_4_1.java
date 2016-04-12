package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range from console
        int range = ArrayUtils.inputArrayRange(sc);

//        Generate and print array
        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);

//        Calculate min and max values
        int minValue = ArrayUtils.getMinInArray(mas);
        int maxValue = ArrayUtils.getMaxInArray(mas);

//        Print min and max values
        System.out.println("Min = " + minValue + "\n" + "Max = " + maxValue);
    }
}
