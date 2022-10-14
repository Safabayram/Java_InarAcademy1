package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[10];

        int number;
        int counter=0;

        System.out.println("enter ten numbers ");

        for (int i = 0; i <numbers.length ; i++) {
            number = input.nextInt();

            if (isDistinct(numbers,number)){
                numbers[counter] = number;
                counter++;
            }

        }
        System.out.println("The number of distinct numbers is " + counter);
        System.out.print("The distinct numbers are");

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] > 0)
                System.out.println(" " + numbers[i]);


        }






    }

    private static boolean isDistinct(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return false;

        }
        return true;
    }
}
