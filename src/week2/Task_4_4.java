package week2;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * 4) Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Task_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Enter array size from console
        int size = ArrayUtils.inputArraySize(sc);

//        Enter array range from console
        int range = ArrayUtils.inputArrayRange(sc);

//        Get number to find and count its occurrences
        System.out.println("Enter a number which you want to find");
        int num = sc.nextInt();

//        Generate and print array
        int[] mas = ArrayUtils.genMas(size, range);
        System.out.println("Generated Array:");
        ArrayUtils.printArr(mas);


        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == num) {
                count++;
            }
        }
        System.out.println();
        System.out.printf("Number %1$d has %2$d occurrences in the array", num, count);
        System.out.println();
    }

}
