package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        Scanner input =new  Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        System.out.println("The index of the minimal value is " +
                indexOfSmallestNumber(numbers));
    }

    private static int indexOfSmallestNumber(double[] list) {
        double min = list[0];
        int minIndex = 0;

        for (int i = 1; i < list.length; i++)
            if (min > list[i]) {
                min = list[i];
                minIndex = i;
            }

        return minIndex;

    }
}
