package week3.utils;

import week2.method.ArrayUtils;

import java.util.Scanner;

/**
 * Created by serhii on 05.03.16.
 */
public class MatrixUtils {

    public static String toString(int[][] mat){
        if(mat == null){
            return "wrong argument, mat is null";
        }

        if(mat.length == 0){
            return "empty matrix";
        }

        String matRes = "";

        // row
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }

        return matRes;
    }

    public static int[][] genMatrixOddEven(int size){
        int[][] mat = new int[size][size];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rand = ArrayUtils.genRandomNum(100);
                if(i % 2 == 0){
                    mat[i][j] = rand % 2 == 0 ? rand : rand + 1;
                } else {
                    mat[i][j] = rand % 2 == 0 ? rand + 1 : rand;
                }

                /*mat[i][j] = i % 2 == 0 ?
                                (rand % 2 == 0 ? rand : rand + 1) :
                                (rand % 2 == 0 ? rand + 1 : rand);  */
            }
        }

        return mat;
    }

    public static int[][] genMatrixOddEven2(int size){
        int[][] mat = new int[size][size];

        for (int i = 0; i < mat.length; i++) {
            mat[i] = i % 2 == 0 ? ArrayUtils.genRandomMasEvenNum(size,100) :
                    ArrayUtils.genRandomMasOddNum(size,100);
        }

        return mat;
    }

//    Enter matrix size (rows and columns number) from console
    public static int[] inputMatrixSize(Scanner sc) {
        int[] size = new int[2];
        System.out.println("Enter rows number:");
        size[0] = sc.nextInt();
        System.out.println("Enter columns number:");
        size[1] = sc.nextInt();
        return size;
    }

//    Enter matrix size from console for square matrix (rows number = columns number)
    public static int inputSquareMatrixSize(Scanner sc) {
        System.out.println("Enter rows / columns number:");
        return sc.nextInt();
    }

//    Generate matrix containing random numbers
    public static int[][] genMatrixRandom(int[] size) {
        int[][] mtrx = new int[size[0]][size[1]];
        for (int i = 0; i < mtrx.length; i++) {
            mtrx[i] = ArrayUtils.genMas(size[1], 100);
        }
        return mtrx;
    }

//    Generate square matrix containing random numbers
    public static int[][] genSquareMatrixRandom(int size) {
        int[][] mtrx = new int[size][size];
        for (int i = 0; i < mtrx.length; i++) {
            mtrx[i] = ArrayUtils.genMas(size, 100);
        }
        return mtrx;
    }

    public static int[][] genMtrxFromConsoleInput(Scanner sc) {
        int[] size = inputMatrixSize(sc);
        return genMatrixRandom(size);
    }

    public static int[][] genSquareMtrxFromConsoleInput(Scanner sc) {
        int size = inputSquareMatrixSize(sc);
        return genSquareMatrixRandom(size);
    }

    public static boolean[][] initBooleanMatrixFromConsoleInput(Scanner sc) {
        int[] size = inputMatrixSize(sc);
        boolean[][] mtrx = new boolean[size[0]][size[1]];
        return mtrx;
    }

//    Print matrix to console
    public static void printMtrx(int[][] mtrx) {
        System.out.println(MatrixUtils.toString(mtrx));
    }

//    Print boolean matrix
    public static String booleanMtrxToString(boolean[][] mat){
        if(mat == null){
            return "wrong argument, mat is null";
        }

        if(mat.length == 0){
            return "empty matrix";
        }

        String matRes = "";

        for (int i = 0; i < mat.length; i++) {
            boolean[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                boolean col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }

        return matRes;
    }


    public static int minRowIndex(int[][] mtrx) {
        int minSum = ArrayUtils.arrSum(mtrx[0]);
        int minSumIndex = 0;
        for (int i = 0; i < mtrx.length; i++) {
            int sum = ArrayUtils.arrSum(mtrx[i]);
            minSumIndex = sum < minSum ? i : minSumIndex;
        }
        return minSumIndex;
    }


    public static int maxRowIndex(int[][] mtrx) {
        int maxSum = ArrayUtils.arrSum(mtrx[0]);
        int maxSumIndex = 0;
        for (int i = 0; i < mtrx.length; i++) {
            int sum = ArrayUtils.arrSum(mtrx[i]);
            maxSumIndex = sum > maxSum ? i : maxSumIndex;
        }
        return maxSumIndex;
    }


    public static int minColumnIndex(int[][] mtrx) {
        // Assume that the first matrix column has max sum value
        int minCoulumnSum = ArrayUtils.arrSum(columnElements(mtrx, 0));
        int minColumnIndex = 0;
        int[] columnArr = new int[mtrx.length];
        // Iterate matrix columns
        for (int i = 0; i < columnArr.length; i++) {
            columnArr = columnElements(mtrx, i);
            // Sum of column elements
            int sum = ArrayUtils.arrSum(columnArr);
            minColumnIndex = sum < minCoulumnSum ? i : minColumnIndex;
        }
        return minColumnIndex;
    }

    public static int maxColumnIndex(int[][] mtrx) {
        // Assume that the first matrix column has max sum value
        int maxCoulumnSum = ArrayUtils.arrSum(columnElements(mtrx, 0));
        int maxColumnIndex = 0;
        int[] columnArr = new int[mtrx.length];
        // Iterate matrix columns
        for (int i = 0; i < columnArr.length; i++) {
            columnArr = columnElements(mtrx, i);
            // Sum of column elements
            int sum = ArrayUtils.arrSum(columnArr);
            maxColumnIndex = sum > maxCoulumnSum ? i : maxColumnIndex;
        }
        return maxColumnIndex;
    }


    public static int[] columnElements(int[][] mtrx, int columnNumber) {
        // Array size equals matrix rows number
        int[] columnArray = new int[mtrx.length];
        for (int i = 0; i < mtrx.length; i++) {
            columnArray[i] = mtrx[i][columnNumber];
        }
        return columnArray;
    }

    public static int[][] mtrxMultiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

}
