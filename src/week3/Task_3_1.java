package week3;

import java.util.Scanner;

import week3.utils.MatrixUtils;

/**
 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class Task_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mtrx = MatrixUtils.genMtrxFromConsoleInput(sc);

        System.out.println("Generated Matrix: ");
        MatrixUtils.printMtrx(mtrx);

        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                if (mtrx[i][j] % 5 == 0){
                    mtrx[i][j] = 8;
                }
            }
        }

        System.out.println("Modified Matrix: ");
        MatrixUtils.printMtrx(mtrx);
    }
}
