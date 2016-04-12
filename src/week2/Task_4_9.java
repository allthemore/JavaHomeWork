package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 	9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class Task_4_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter min range value = 25
        System.out.println("Input min: ");
        int min = sc.nextInt();

//        Enter max range value = 75
        System.out.println("Input max: ");
        int max = sc.nextInt();

//        Generate arrays and print out them
        int[] mas1 = ArrayUtils.genMasInRange(size, min, max);
        int[] mas2 = ArrayUtils.genMasInRange(size, min, max);

        System.out.println();
        System.out.println("Generated arrays:");
        ArrayUtils.printArr(mas1);
        ArrayUtils.printArr(mas2);
        System.out.println();

//        Calculate quantity of even elements
        int mas1Even = ArrayUtils.getEvenElementsQuantity(mas1);
        int mas2Even = ArrayUtils.getEvenElementsQuantity(mas2);

        System.out.printf("First array has %d even numbers", mas1Even);
        System.out.println();
        System.out.printf("Second array has %d even numbers",mas2Even);
        System.out.println();
        System.out.println();

        if (mas1Even > mas2Even) {
            System.out.println("First array has more even elements");
        } else if (mas1Even < mas2Even){
            System.out.println("Second array has more even elements");
        } else if (mas1Even == mas2Even) {
            System.out.println("Both arrays have equal number of even elements");
        }
    }
}
