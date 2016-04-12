package week3;

import week3.utils.MatrixUtils;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
    3.4. Создать массив, который будет состоять из диагонали матрици

     1 3 5
     4 5 7  -  1 5 6
     4 5 6
 */
public class Task_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mtrx[][] = MatrixUtils.genSquareMtrxFromConsoleInput(sc);

        System.out.println("Generated Matrix");
        MatrixUtils.printMtrx(mtrx);

//        Init variable to store diagonal matrix values
        int[] diagonal = new int[mtrx.length];

        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j <mtrx[i].length ; j++) {
                if (i == j) {
                    diagonal[i] = mtrx[i][j];
                }
            }
        }

        System.out.println("Generated Array: ");
        ArrayUtils.printArr(diagonal);
    }
}
