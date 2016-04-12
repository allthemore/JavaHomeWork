package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter first array range
        System.out.print("Generating first array. ");
        int rangeOfFirst = ArrayUtils.inputArrayRange(sc);

//        Enter second array range
        System.out.print("Generating second array. ");
        int rangeOfSecond = ArrayUtils.inputArrayRange(sc);

//        Generate arrays and print out them
        int[] masFirst = ArrayUtils.genMas(size, rangeOfFirst);
        int[] masSecond = ArrayUtils.genMas(size, rangeOfSecond);

        System.out.println();
        System.out.println("Generated Arrays:");
        ArrayUtils.printArr(masFirst);
        ArrayUtils.printArr(masSecond);
        System.out.println();

//        Copy values from the first array to the second
        for (int i = 0; i < size; i++) {
            masSecond[i] = masFirst[i];
        }

//        Print modified array:
        System.out.println("Modified Array:");
        ArrayUtils.printArr(masFirst);
        ArrayUtils.printArr(masSecond);
    }
}
