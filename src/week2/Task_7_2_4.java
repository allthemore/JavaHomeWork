package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 	2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 * Количество позиций и массив указывает пользователь
 */
public class Task_7_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range from console
        int range = ArrayUtils.inputArrayRange(sc);

//        Enter number of elements to shift
        System.out.println("Enter a number of positions to shift");
        int shift = sc.nextInt();

//        Generate and print array
        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);
        System.out.println();

//        Modify array
        int[] mas1 = new int[size];
        mas1 = ArrayUtils.shiftArray(mas, shift);

        System.out.println("Modified Array:");
        ArrayUtils.printArr(mas1);
        System.out.println();
    }
}
