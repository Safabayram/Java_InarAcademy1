package week_09;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {




        fillTheArr();

    }
    public static void fillTheArr(){
        int [] arr = new int[10];
        for(int i = 0; i < arr.length;i++ ){
            arr[i] = ((int)(Math.random() * 10));


        }
        System.out.println(Arrays.toString(arr));

    }




}
