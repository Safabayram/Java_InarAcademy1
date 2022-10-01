package chapters.chapter06.exercise06;

import java.util.Scanner;

public class Exercise6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers");
        double number1 = input.nextDouble();
        System.out.println("enter three numbers");
        double number2 = input.nextDouble();
        System.out.println("enter three numbers");
        double number3 = input.nextDouble();
        System.out.println("three number increasing order is");
        displaySortedNumbers(number1, number2, number3);


    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max;
        if (num1 > num2) {
            max = num1;
            if (max > num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }
        } else {
            max = num2;
            if (max > num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);


            } else {
                System.out.println(num3 + " > " + num2 + " > " + num1);

            }
        }

    }
}
