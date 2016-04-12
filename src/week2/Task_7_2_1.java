package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * Created on 17/03/2016.
 */
public class Task_7_2_1 {
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
        System.out.println();

        ArrayUtils.invertArray(mas);

        System.out.println("Modified Array:");
        ArrayUtils.printArr(mas);
        System.out.println();
    }
}
