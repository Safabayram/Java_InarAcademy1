package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[10];
        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("The average for integers is " + average(list1));



        double[] list2 = new double[10];
        System.out.print("Enter 10 double values: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextDouble();
        }



        System.out.println("The average for double values is " + average(list2));
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum * 1.0 / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}



