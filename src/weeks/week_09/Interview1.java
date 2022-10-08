package week_09;

import java.util.Arrays;

public class Interview1 {
    public static void main(String[] args) {

        copyArray();


    }

    private static void copyArray() {
        int[] a = new int[5];
        fillTheArrWithRandomValues(a);
        System.out.println("Oncesi  :" + Arrays.toString(a));
        int length = 8;
        a = extendArray(a, length);
        System.out.println("Sonrasi :" + Arrays.toString(a));
    }

    private static int[] extendArray(int[] a, int c) {
        int[] b = new int[c];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        return a;
    }


    private static void findTheSecondMax() {

        int[] arr = new int[10];
        fillTheArrWithRandomValues(arr);
        int num = getSecondMaxNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.printf("Second max number is %d",num);
    }

    private static int getSecondMaxNumber(int[] arr) {
        int max = getMaxNumber(arr);
        int secondMax = -1;
        //9 5 3
        for (int i = 0; i < arr.length; i++) {
            if(secondMax < arr[i] && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    private static int getMaxNumber(int[] arr) {
        int max = -1;// the reason of the "-1" is if max number is in first index it returns false output.
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static void fillTheArrWithRandomValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random()*100);
            arr[i] = random;
        }
    }






    private static int sum(int[] cArr) {
        int sum = 0;
        for (int sayi : cArr){
            sum += sayi;
        }
        return sum;
    }



    private static void yazdir(String[] inarArr) {
        System.out.println(Arrays.toString(inarArr));
    }

    private static void yazdir(char[] inarArr) {
        System.out.println(Arrays.toString(inarArr));
    }

    private static void yazdir(boolean[] inarArr) {
        System.out.println(Arrays.toString(inarArr));
    }

    private static void yazdir(int[] inarArr) {
        for (int a: inarArr) {
            System.out.println(a);
        }
    }


}

