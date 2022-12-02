package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_35 {
    public static void main(String[] args) {
        int [][] matrix = getMatrix();

        int[] maximumSquareMatrixStartIndex = findMaximumSquareMatrix(matrix);

        if (maximumSquareMatrixStartIndex[2] > 1) {
            System.out.println("The maximum square sub-matrix is at (" + maximumSquareMatrixStartIndex[0] +
                    ", " + maximumSquareMatrixStartIndex[1] + ") with size " + maximumSquareMatrixStartIndex[2]);
        } else {
            System.out.println("There is no square matrix.");
        }

    }

    public static int[] findMaximumSquareMatrix(int[][] matrix) {
        int[] result = new int[3];
        int minSize = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                while(isSquareMatrix(matrix, i, j, minSize)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = minSize;
                    minSize++;
                }
            }
        }
        return result;
    }
    public static boolean isSquareMatrix(int[][] matrix, int row, int column, int size) {
        if(column + size > matrix[row].length) {
            return false;
        }

        if(row + size > matrix.length) {
            return false;
        }

        for (int i = row; i < row + size; i++) {
            for (int j = column; j < column + size; j++) {
                if(matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }


}
