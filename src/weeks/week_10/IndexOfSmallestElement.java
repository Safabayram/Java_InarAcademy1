package week_10;

import week_09.BinarySearch;

import java.util.Scanner;

public class IndexOfSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of the array");
        int l = input.nextInt();

        int [] arr = new int[l];
        fillArrWithRandomValues(arr,0,100);
        int indexOfMinValue = ındexOfSmallestElement(arr);
        printArr(arr);
        if(arr.length > 0) {
            System.out.printf("the minumum value is %d,the index of this number is %d", arr[indexOfMinValue],indexOfMinValue);
        }



    }

    private static int ındexOfSmallestElement(int[] list) {
        int index = -1;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < list.length ; i++) {
            if (list[i] <= min){
                index = i;
                min = list[i];
            }

        }return index;




    }

    public static void fillArrWithRandomValues(int[] arr, int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            int num = start + (int)(Math.random()* (limit -start));
            arr[i] = num;
        }
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("(%d) %d, ", i,arr[i]);
        }
        System.out.println("]");
    }

}
