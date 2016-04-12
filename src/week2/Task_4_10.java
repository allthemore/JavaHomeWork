package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 	10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 * }
 */
public class Task_4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range from console
        int range = ArrayUtils.inputArrayRange(sc);

//        Enter 'start' value
        System.out.println("Enter start array index");
        int start = sc.nextInt();

//        Enter 'end' value
        System.out.println("Enter end array index");
        int end = sc.nextInt();

//        Generate and print array
        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);

//        Remove array elements out of start-end range
        int[] mas1 = ArrayUtils.splitArray(mas, start, end);

        System.out.println();
        System.out.println("Modified array:");
        ArrayUtils.printArr(mas1);

        System.out.println();
        int[] mas2 = ArrayUtils.splitArray1(mas, start, end);
        System.out.println("Modified array (other method used):");
        ArrayUtils.printArr(mas2);
    }
}
