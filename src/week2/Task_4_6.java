package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 6) Найти среднее арифметическое массива
 */
public class Task_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range
        int range = ArrayUtils.inputArrayRange(sc);

//        Generate and print out array
        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);
        System.out.println();

//        Calculate arithmetic average and print it out
        double avg = ArrayUtils.arithmeticAverage(mas);
        ArrayUtils.printAverage(avg);
    }
}
