package week3;

import week2.method.ArrayUtils;
import week3.utils.MatrixUtils;

import java.util.Scanner;

/**

   3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
        b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Task_3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mtrx = MatrixUtils.genMtrxFromConsoleInput(sc);

        System.out.println("Generated Matrix: ");
        MatrixUtils.printMtrx(mtrx);

        // Calculate indices of the rows with min and max sum values
        int minRowIndex = MatrixUtils.minRowIndex(mtrx);
        int maxRowIndex = MatrixUtils.maxRowIndex(mtrx);

        // Print out min/max rows and sum of their elements
        System.out.println("Index of a row with min sum value: " + minRowIndex);
        System.out.print("Row elements: ");
        ArrayUtils.printArr(mtrx[minRowIndex]);
        System.out.println("Sum of row elements: " + ArrayUtils.arrSum(mtrx[minRowIndex]));
        System.out.println();

        System.out.println("Index of a row with max sum value: " + maxRowIndex);
        System.out.print("Row elements: ");
        ArrayUtils.printArr(mtrx[maxRowIndex]);
        System.out.println("Sum of row elements: " + ArrayUtils.arrSum(mtrx[maxRowIndex]));
        System.out.println();

        // Swap rows
        int[] tmp = mtrx[maxRowIndex];
        int[][] mtrxSwappedRows = new int[mtrx.length][mtrx[0].length];
        System.arraycopy(mtrx, 0, mtrxSwappedRows, 0, mtrx.length);
        mtrxSwappedRows[maxRowIndex] = mtrx[minRowIndex];
        mtrxSwappedRows[minRowIndex] = tmp;

        System.out.println("Matrix with swapped rows: ");
        MatrixUtils.printMtrx(mtrxSwappedRows);

        // Find columns with min and max sum of elements
        int minColumnIndex = MatrixUtils.minColumnIndex(mtrx);
        int maxColumnIndex = MatrixUtils.maxColumnIndex(mtrx);

        // Print out min/max columns and sum of their elements
        System.out.println("Index of a column with min sum: " + minColumnIndex);
        System.out.print("Column elements: ");
        ArrayUtils.printArr(MatrixUtils.columnElements(mtrx, minColumnIndex));
        System.out.println("Sum of column elements: " +
                ArrayUtils.arrSum(MatrixUtils.columnElements(mtrx, minColumnIndex)));
        System.out.println();

        System.out.println("Index of a column with max sum: " + maxColumnIndex);
        System.out.print("Column elements: ");
        ArrayUtils.printArr(MatrixUtils.columnElements(mtrx, maxColumnIndex));
        System.out.println("Sum of column elements: " +
                ArrayUtils.arrSum(MatrixUtils.columnElements(mtrx, maxColumnIndex)));
        System.out.println();

        // Swap columns
        int tmp1;
        for (int i = 0; i < mtrx.length; i++) {
            tmp1 = mtrx[i][maxColumnIndex];
            mtrx[i][maxColumnIndex] = mtrx[i][minColumnIndex];
            mtrx[i][minColumnIndex] = tmp1;
        }

        System.out.println("Matrix with swapped columns: ");
        MatrixUtils.printMtrx(mtrx);
        System.out.println();
    }
}
