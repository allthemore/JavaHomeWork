package week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 * тельные заменить на 0.
 */
public class Additional_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        init list of integers
        int[] lst = new int[3];
//        add numbers from console to the list
        for  (int i = 0; i <= 2; i++) {
            System.out.println("Input number");
            lst[i] = sc.nextInt();
            if (lst[i] > 0){
                lst[i] = lst[i] * lst[i] * lst[i];
            } else {
                lst[i] = 0;
            }
            }
//        Print the whole list lst to console
        System.out.println(Arrays.toString(lst));
        }
    }
