package chapters.chapter_13.exercises_13.Exercise_20;

import chapters.chapter_13.exercises_13.Exercise_17.Complex;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            Complex root1 = new Complex(-b / (2 * a), Math.pow(-discriminant, 0.5) / (2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.pow(-discriminant, 0.5) / (2 * a));
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root1 = -b / (2 * a);
            System.out.println("The root is " + root1);
        } else {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }


    }
}
