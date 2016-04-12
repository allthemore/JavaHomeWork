package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 * который получается в результате суммы arr1[i] + arr2[i]
 */
public class Task_4_8 {
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

//        Generate first and second arrays and print them out
        int[] arr1 = ArrayUtils.genMas(size, rangeOfFirst);
        int[] arr2 = ArrayUtils.genMas(size, rangeOfSecond);

        System.out.println("Generated Arrays:");
        ArrayUtils.printArr(arr1);
        ArrayUtils.printArr(arr2);
        System.out.println("");

//        Init third array
        int[] sumArray = new int[size];

//        Calculate the sum of elements in bot arrays
        for (int i = 0; i < size; i++) {
            sumArray[i] = arr1[i] + arr2[i];
            }

        System.out.println("Result Array arr1[i] + arr2[i]:");
        ArrayUtils.printArr(sumArray);

    }
}
