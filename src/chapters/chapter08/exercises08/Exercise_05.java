package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROWS = 3;
        final int NUMBER_OF_COLUMNS = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 : ");
        double[][] matrix1 = getMatrix(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);
        System.out.print("Enter matrix2 : ");
        double[][] matrix2 = getMatrix(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);

        double[][] sumOfMatrix = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows");
        for (int i = 0; i < matrix1.length; i++) {
            if (i == 1) {
                System.out.println(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "  +  " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "  =  " + sumOfMatrix[i][0] + " " + sumOfMatrix[i][1] + " " + sumOfMatrix[i][2]);
            } else {
                System.out.println(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "     " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "     " + sumOfMatrix[i][0] + " " + sumOfMatrix[i][1] + " " + sumOfMatrix[i][2]);
            }
        }
    }





    public static double[][] getMatrix(int number_of_rows, int number_of_columns) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[number_of_rows][number_of_columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}


