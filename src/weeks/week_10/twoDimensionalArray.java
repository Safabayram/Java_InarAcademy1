package week_10;

import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of row");
        int row = input.nextInt();
        System.out.println("enter the number of column");

        int column = input.nextInt();



        int [][] arr = new int[row][column];

        fill2DArrWithRandomValues(arr,0,10);
        printArr(arr);










    }
    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                arr[row][column] = (int)(Math.random() * (limit - start) + start);

            }

        }

    }
    public static void printArr(int[][] arr) {
        System.out.println("-----------------");
        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.printf(" [%3d] ", arr[satir][sutun]);
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }





}
