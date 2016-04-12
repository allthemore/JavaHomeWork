package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Task_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size has to be even. ");

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Check that array size is even, ask to enter new size otherwise
        if(size % 2 != 0) {
            System.out.print("Array size has to be even, select other value. ");
            size = ArrayUtils.inputArraySize(sc);
        }

//        Enter array range
        int range = ArrayUtils.inputArrayRange(sc);

        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);
        System.out.println();

//        Calculate arithmetic average of the first and second array half
        double avg1 = ArrayUtils.arithmeticAverage(mas, 0, mas.length / 2);
        double avg2 = ArrayUtils.arithmeticAverage(mas, mas.length / 2, mas.length);

        System.out.println();
        System.out.print("First half. ");
        ArrayUtils.printAverage(avg1);

        System.out.print("Second half. ");
        ArrayUtils.printAverage(avg2);

        System.out.println();

//        Print out elements of an array with larger arithmetic average
        System.out.println("The following array half has the larger arithmetical average: ");
        if (avg1 >= avg2) {
            ArrayUtils.printArrayElementsRange(mas, 0, mas.length / 2);
        } else {
            ArrayUtils.printArrayElementsRange(mas, mas.length / 2, mas.length);
        }
    }
}
