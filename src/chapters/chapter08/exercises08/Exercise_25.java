package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        
        double[][] matrix = getMatrix();

        
        System.out.println("It is" + (isMarkovMatrix(matrix) ? " " : " not ") +
                "a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        if (isPositive(matrix) && isEachColumnsSumEquals1(matrix)){
            return true;
        }
        return false;

    }

    private static boolean isEachColumnsSumEquals1(double[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if (sum == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPositive(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    return true;
                }
            }
        }

        return false;
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


}
