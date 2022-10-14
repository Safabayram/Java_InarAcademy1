package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter the ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("the min number is " + getMin(numbers));





    }

    private static double getMin(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;


    }
}
