package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] array = new double[row][column];

        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] largestLoc = locateLargest(array);
        System.out.println("The location of the largest element is at (" + largestLoc[0] + ", " + largestLoc[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    arr[0] = i;
                    arr[1] = j;
                    max = a[i][j];

                }

            }

        }
        return arr;
    }
}


