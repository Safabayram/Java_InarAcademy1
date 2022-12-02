package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = new int[10];
        System.out.println("enter ten integer");

        fillTheArray(arr);

        reverse(arr);

    }

    private static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");

    }

    private static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();

        }

    }
}
