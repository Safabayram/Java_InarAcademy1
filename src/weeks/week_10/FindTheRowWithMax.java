package week_10;

import java.util.Scanner;

public class FindTheRowWithMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of row");
        int row = input.nextInt();
        System.out.println("enter the number of column");
        int column = input.nextInt();

        int arr [][]  = new int[row][column];
        fill2DArrWithRandomValues(arr,0,10);
        int rowIndex = getTheRowIndexWithMaxSum(arr);
        printArr(arr);
        System.out.println(rowIndex + 1);










    }

    public static int getTheRowIndexWithMaxSum(int[][] arr) {
        int i = -1;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            int sumOfRow = getSumOfGivenRow(arr[row]);
            if (sumOfRow >=max){
                i = row;
                max = sumOfRow;

            }

        }
        return i;
    }

    private static int getSumOfGivenRow(int[] row) {
        int sum = 0;
        for (int num:row) {
            sum+= num;

        }
        return sum;
    }

    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * (limit - start) + start);
            }
        }
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
