package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];


        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();


        System.out.println("The mean is " + getMean(numbers));
        System.out.println("The standard deviation is " + getDeviation(numbers));
    }

    private static double getDeviation(double[] a) {
        double deviation= 0;
        double mean = getMean(a);
        for (int i = 0; i <a.length ; i++) {
            deviation+= Math.pow(a[i] - mean,2);


        }
        deviation = Math.sqrt(deviation / a.length - 1);
        return  deviation;


    }

    private static double getMean(double[] a) {
        double mean = 0;
        for (int i = 0; i <a.length ; i++) {
            mean += a[i];


        }
        return mean / a.length;

    }
}
