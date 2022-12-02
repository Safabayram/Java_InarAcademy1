package chapters.chapter_08.exercises08;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        int[][] matrix = getUserMatrix();

        System.out.print("Matrix has" + (isConsecutiveFour(matrix) ? "" : " not") +
                " consecutive four numbers");

    }

    private static boolean isConsecutiveFour(int[][] matrix) {
        return (isConsecutiveFourAtRows(matrix) ||
                isConsecutiveFourAtColumns(matrix) ||
                isConsecutiveFourAtRightDiagonal(matrix) ||
                isConsecutiveFourAtLeftDiagonal(matrix));
    }

    private static boolean isConsecutiveFourAtLeftDiagonal(int[][] matrix) {
        int counter;
        for (int i = matrix.length - 4; i >0 ; i--) {
            counter=1;
            for (int row = i, col = matrix[i].length - 1; row < matrix.length -1 ; row++,col--) {
                if (matrix[row][col] == matrix[row + 1][col - 1]){
                    counter++;
                }else {
                    counter=1;

                }
                if (counter == 4){
                    return true;
                }
            }


        }
        return false;
    }

    private static boolean isConsecutiveFourAtRightDiagonal(int[][] matrix) {
        int counter;
        for (int i = matrix.length - 4; i >0 ; i--) {
            counter =1;
            for (int row = i , col = 0; row < matrix.length - 1; col++,row++) {
                if (matrix[row][col] == matrix[row + 1][col + 1]){
                    counter++;

                }else {
                    counter = 1;
                }
                if (counter == 4){
                    return true;
                }

            }

        }
        return false;
    }

    private static boolean isConsecutiveFourAtColumns(int[][] matrix) {
        int counter;
        for (int i = 0; i < matrix[0].length ; i++) {
            counter =1;
            for (int j = 0; j <matrix.length - 1; j++) {
                if (matrix[j][i] == matrix[j + 1][i]){
                    counter++;
                }else {
                    counter = 1;
                }
                if (counter == 4){
                    return true;
                }

            }

        }

        return false;
    }

    private static boolean isConsecutiveFourAtRows(int[][] matrix) {
        int counter;
        for (int i = 0; i < matrix.length ; i++) {
            counter =1;
            for (int j = 0; j <matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j +1]){
                    counter++;
                }else {
                    counter = 1;
                }
                if (counter == 4){
                    return true;
                }

            }

        }
        return false;
    }

    private static int[][] getUserMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row and column length for matrix: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Fill the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;

    }

}
