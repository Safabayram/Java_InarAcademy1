package chapters.chapter09.exercises09;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        double discriminant = quad.getDiscriminant();

        if (discriminant < 0) {
            System.out.println("The equation has no roots");
        }
        else if (discriminant == 0)
        {
            System.out.println("The root is " + quad.getRoot1());
        }
        else
        {
            System.out.println("The roots are " + quad.getRoot1()
                    + " and " + quad.getRoot2());
        }
    }

}
