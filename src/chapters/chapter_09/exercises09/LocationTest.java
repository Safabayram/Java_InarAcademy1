package chapters.chapter_09.exercises09;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];

        System.out.println("Enter array: ");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);

        System.out.println("The location of the largest element is " +
                location.getMaxValue() + " at (" + location.getRow() + ", " + location.getColumn() + ")");











    }
    public static Location locateLargest(double[][] a){
        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if (a[i][j] > maxValue){
                    row = i;
                    col = j;

                    maxValue = a[i][j];
                }

            }

        }
        return new Location(row,col,maxValue);

    }
}
