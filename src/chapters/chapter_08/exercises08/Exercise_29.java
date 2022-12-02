package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {
        int[][] arr = getArray();
        int[][] arr2 = getArray();

        System.out.println("The two arrays are" +
                (equals(arr, arr2) ? " " : " not ") + " identical");



    }
    public static boolean equals(int[][] m1, int[][] m2){
        int [] sortedArray = sort(m1);
        int [] sortedArray1 = sort(m2);
        for (int i = 0; i <sortedArray.length ; i++) {
            if (sortedArray[i] != sortedArray1[i])
                return false;

        }
        return true;


    }
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextInt();

            }

        }
        return a;

    }
    public static int[] sort(int [][] m){
        int[] twoDto1list = new int[m.length * m[0].length];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                twoDto1list[k] = m[i][j];
                k++;
            }
        }

        for (int i = 0; i < twoDto1list.length - 1; i++) {

            int min = twoDto1list[i];
            int minIndex = i;

            for (int j = i + 1; j < twoDto1list.length; j++) {
                if (min > twoDto1list[j]) {
                    min = twoDto1list[j];
                    minIndex = j;
                }
            }


            if (minIndex != i) {
                twoDto1list[minIndex] = twoDto1list[i];
                twoDto1list[i] = min;
            }
        }
        return twoDto1list;


    }
}
