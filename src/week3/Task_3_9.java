package week3;

import week3.utils.MatrixUtils;

import java.util.Scanner;

/**
   3.9. Умножить две матрицы
 */
public class Task_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate matrix A
        System.out.println("Enter values for A Matrix.");
        int[][] matA = MatrixUtils.genMtrxFromConsoleInput(sc);

        // Generate matrix B
        System.out.println("Enter values for B Matrix. Rows number of B has to be equal to columns num ber of A.");
        int[][] matB = MatrixUtils.genMtrxFromConsoleInput(sc);

        //Print out generated matrix A and B
        System.out.println("Generated A Matrix: ");
        MatrixUtils.printMtrx(matA);
        System.out.println("Generated B Matrix: ");
        MatrixUtils.printMtrx(matB);

        if (matA[0].length == matB.length) {
            int[][] matC = MatrixUtils.mtrxMultiply(matA, matB);
            System.out.println("Result of AxB: ");
            MatrixUtils.printMtrx(matC);
        } else {
            System.out.println("Rows number of B doesn't equal to columns number of A. Impossible to multiply.");
            System.out.println("");
        }

    }
}
