package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        double[][] sortedMatrix = sortRows(matrix);

        System.out.println("\nThe row-sorted array is");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }




    }
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double [][] a = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = input.nextDouble();

            }

        }
        return a;

    }
    public static double[][] sortRows(double[][] m){
        double[][] sortedMatrix = new double[m.length][m[0].length];


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                sortedMatrix[i][j] = m[i][j];
            }
        }

        for (int row = 0; row < sortedMatrix.length; row++) {
            for (int col = 0; col < sortedMatrix.length - 1; col++) {
                double min = sortedMatrix[row][col];
                int index = col;
                for (int j = col + 1; j < sortedMatrix.length; j++) {
                    if (min > sortedMatrix[row][j]) {
                        min = sortedMatrix[row][j];
                        index = j;
                    }
                }
                if (index != col) {
                    sortedMatrix[row][index] = sortedMatrix[row][col];
                    sortedMatrix[row][col] = min;
                }
            }
        }
        return sortedMatrix;





    }

}
