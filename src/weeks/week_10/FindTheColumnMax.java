package week_10;

import java.util.Scanner;

public class FindTheColumnMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of row");
        int row = input.nextInt();
        System.out.println("enter the number of column");
        int column = input.nextInt();

        int arr[][] = new int[row][column];
        fill2DArrWithRandomValues(arr, 0, 10);
        int colIndex = getTheColumnIndexWithMaxSum(arr);
        printArr(arr);

        System.out.println(colIndex + 1);



    }

    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * (limit - start) + start);
            }
        }
    }

    public static int getTheColumnIndexWithMaxSum(int[][] arr) {
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int column = 0; column < arr[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < arr.length ; row++) {
                sum+= arr[row][column];

            }

            if (sum >= max) {
                index = column;
                max = sum;

            }

        }
        return index;

    }
    public static void printArr(int[][] arr) {

        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.printf(" [%3d] ", arr[satir][sutun]);
            }
            System.out.println();
        }

    }
}
