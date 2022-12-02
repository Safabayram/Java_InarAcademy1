package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        getReverse(numbers);

        System.out.println("The reversal of the input is");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

    }

    private static double[]  getReverse(double[] list) {
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;

    }


}
