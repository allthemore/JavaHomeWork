package week3;

import week3.utils.MatrixUtils;

import java.util.Scanner;

/**
 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class Task_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] mtrx = MatrixUtils.initBooleanMatrixFromConsoleInput(sc);

//        Modify matrix default values
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length ; j++) {
                if (i == j) {
                    mtrx[i][j] = true;
                }
            }
        }
        System.out.println("Modified Matrix: ");
        System.out.println(MatrixUtils.booleanMtrxToString(mtrx));
    }
}
