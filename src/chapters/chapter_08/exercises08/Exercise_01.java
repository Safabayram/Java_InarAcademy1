package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row");
        double [][]matrix = new double[3][4];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();

            }

        }
        getSumOfColumns(matrix);







    }
    public static void getSumOfColumns(double[][] matrix){
        for (int column = 0; column <matrix[0].length ; column++) {
            double sum = 0;
            for (int row = 0; row < matrix.length ; row++) {
                sum += matrix[row][column];

            }
            System.out.println("Sum of the elements  column "  + column + " is " + sum);

        }
    }
}
