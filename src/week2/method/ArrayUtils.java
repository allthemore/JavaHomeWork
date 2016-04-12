package week2.method;

import java.util.Scanner;

/**
 * Created by serhii on 28.02.16.
 */
public class ArrayUtils {


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printCharArr(char[] arr){
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }


    public static int[] genMas(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = genRandomNum(range);
        }
        return mas; // end method
    }


    // Generate array with elements values in the range specified
    public static int[] genMasInRange(int size, int min, int max){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = genRandomInRange(min, max);
        }
        return mas;
    }


    public static int genRandomNum(int range) {
        return (int)(Math.random() * range);
    }


    // Generate random number in range
    public static int genRandomInRange(int min, int max){
        int range = max - min; // the highest generated number will be less but not included 'max'
//        int = range = max - min + 1 -- the highest generated number can equal 'max'
        return (int)(Math.random() * range) + min;
    }


    public static int[] genRandomMasEvenNum(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);
            // ternary operator
            mas[i] = random % 2 == 0 ? random : random + 1;
        }
        return mas;
    }


    public static int[] genRandomMasOddNum(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);
            // ternary operator
            mas[i] = random % 2 != 0 ? random : random + 1;
        }

        return mas;
    }


    public static int[] genRandomMasEvenAndOddNum(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);
            // ternary operator
            mas[i] = (i % 2 == 0 && random % 2 == 0) || (i % 2 != 0 && random % 2 != 0) ?
                     random : random + 1;
        }
        return mas;
    }


    public static String convert(int[] mas){
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ",";
        }
        return res;
    }


    // Get min int in an array
    public static int getMinInArray(int[] mas) {
        int minValue = mas[0];

        for (int i = 0; i < mas.length ; i++) {
            if (minValue > mas[i]) {
                minValue = mas[i];
            }
        }
        return minValue;
    }


    // Get max int in an array
    public static int getMaxInArray(int[] mas) {
        int maxValue = mas[0];

        for (int i = 0; i < mas.length ; i++) {
            if (maxValue < mas[i]) {
                maxValue = mas[i];
            }
        }
        return maxValue;
    }


    // Get index of int element in array
    public static int getIndexOfElementInArray(int[] mas, int element) {
        int index = 0;

        for (int i = 0; i < mas.length ; i++) {
            if (mas[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }


    // Enter array size from console
    public static int inputArraySize(Scanner sc) {
        System.out.println("Enter Array size:");
        return sc.nextInt();
    }


    // Enter array range from console
    public static int inputArrayRange(Scanner sc) {
        System.out.println("Enter Array range:");
        return sc.nextInt();
    }


    // Calculate sum of array elements
    public static int arrSum(int[] mas){
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }

    // Calculate arithmetic average of all array elements
    public static double arithmeticAverage(int[] mas) {
        int sum = ArrayUtils.arrSum(mas);
        System.out.println("Sum of array elements: " + sum);
        return (double) sum / mas.length;
    }


    // Calculate arithmetic average of array elements from element with beginIndex to element with endIndex
    public static double arithmeticAverage(int[] mas, int beginIndex, int endIndex) {
        int sum = 0;
        for (int i = beginIndex; i < endIndex; i++) {
            sum += mas[i];
        }
        System.out.printf("Sum of array elements from [%1$d] to [%2$d]: %3$d", beginIndex, endIndex, sum);
        System.out.println();
        return (double) sum / (endIndex - beginIndex);
    }


    // Print arithmetic average value
    public static void printAverage(double average) {
        System.out.printf("Arithmetic average of specified array elements: %.2f", average);
        System.out.println();
    }


    // Print specified range of array elements
    public static void printArrayElementsRange(int[] mas, int beginIndex, int endIndex){
        System.out.printf("Array elements from [%1$d] to [%2$d]: ", beginIndex, endIndex);
        for (int i = beginIndex; i < endIndex; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }


    // Calculate quantity of even numbers in array
    public static int getEvenElementsQuantity(int[] mas){
        int qty = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0){
                qty++;
            }
        }
        return qty;
    }


    public static int[] splitArray(int[] arr, int start, int end){
        int[] mas = new int[end - start];
        for (int i = start; i < end; i++) {
            mas[i - start] = arr[i];
        }
        return mas;
    }


    public static int[] splitArray1(int[] arr, int start, int end)  {
        int[] mas = new int[end - start];
        System.arraycopy(arr, start, mas, 0, end - start);
        return mas;
    }


    public static int[] invertArray(int[] mas) {
        int tmp;
        for (int i = 0; i < mas.length / 2; i++) {
            tmp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = tmp;
        }
        return mas;
    }


    public static int[] shiftArray(int[] mas, int shift) {
        int[] mas1 = new int[mas.length];
        System.arraycopy(mas, mas.length - shift, mas1, 0, shift);
        System.arraycopy(mas, 0, mas1, shift, mas.length - shift);
        return mas1;
    }

}


