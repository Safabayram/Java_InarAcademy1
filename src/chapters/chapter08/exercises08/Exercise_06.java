package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROWS = 3;
        final int NUMBER_OF_COLUMNS = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 : ");
        double[][] matrix1 = getMatrix(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);
        System.out.print("Enter matrix2 : ");
        double[][] matrix2 = getMatrix(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);

        double [][] multiplyedMatrix = multiplyMatrix(matrix1,matrix2);
        System.out.println("The matrices are multipliyed as follows");
        for (int i = 0; i < matrix1.length; i++) {
            if (i == 1) {
                System.out.println(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "  *  " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "  =  " + multiplyedMatrix[i][0] + " " + multiplyedMatrix[i][1] + " " + multiplyedMatrix[i][2]);
            } else {
                System.out.println(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "     " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "     " + multiplyedMatrix[i][0] + " " + multiplyedMatrix[i][1] + " " + multiplyedMatrix[i][2]);
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
    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] x = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    x[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return x;


    }

}
