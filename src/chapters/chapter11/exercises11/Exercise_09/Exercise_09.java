package chapters.chapter11.exercises11.Exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        getFilledMatrix(matrix);

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();

        getRowsInList(rows, matrix);
        getColumnsList(columns, matrix);

        displayMatrix(matrix);

        System.out.println("The largest row index:" + rows.indexOf(java.util.Collections.max(rows)));
        System.out.println("The largest column index:" + columns.indexOf(java.util.Collections.max(columns)));






    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void getColumnsList(ArrayList<Integer> columns, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            columns.add(count);
        }
    }

    private static void getRowsInList(ArrayList<Integer> rows, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            rows.add(count);
        }

    }

    private static void getFilledMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }


}
