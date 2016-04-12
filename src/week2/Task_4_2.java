package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 2) Поменять местами наибольший
 * и наименьший элементы в массиве
 */
public class Task_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range
        int range = ArrayUtils.inputArrayRange(sc);

        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);
        System.out.println();

//        Calculate min and max values
        int minValue = ArrayUtils.getMinInArray(mas);
        int maxValue = ArrayUtils.getMaxInArray(mas);

//        Print min and max values
        System.out.println("Min Value: " + minValue + "; Max Value: " + maxValue);
        System.out.println();

//        Calculate indexes of min and max elements
        int minIndex = ArrayUtils.getIndexOfElementInArray(mas, minValue);
        int maxIndex = ArrayUtils.getIndexOfElementInArray(mas, maxValue);

//        Print calculated indexes
        System.out.println("Index of min element: " + minIndex + "; Index of max element: " + maxIndex);
        System.out.println();
        mas[maxIndex] = minValue;
        mas[minIndex] = maxValue;

//        Print modified array
        System.out.println("Modified Array:");
        ArrayUtils.printArr(mas);
    }
}
