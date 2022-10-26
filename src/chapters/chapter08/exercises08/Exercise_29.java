package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {
        int[][] arr = getArray();
        int[][] arr2 = getArray();

        System.out.println("The two arrays are" +
                (equals(arr, arr2) ? " " : " not ") + " identical");



    }
    public static boolean equals(int[][] m1, int[][] m2){


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
}
