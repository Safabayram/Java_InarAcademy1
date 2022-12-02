package chapters.chapter_13.exercises_13.Exercise_17;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        System.out.print("Enter the second complex number: ");
        double c1 = input.nextDouble();
        double c2 = input.nextDouble();

        Complex complex1 = new Complex(n1, n2);
        Complex complex2 = new Complex(c1, c2);


        System.out.print(complex1 + " + " + complex2 + " = ");
        print(complex1.add(complex2));

        System.out.print(complex1 + " - " + complex2 + " = ");
        print(complex1.subtract(complex2));

        System.out.print(complex1 + " * " + complex2 + " = ");
        print(complex1.multiply(complex2));

        System.out.print(complex1 + " / " + complex2 + " = ");
        print(complex1.divide(complex2));


    }

    public static void print(Complex n) {
        if (n.getImaginaryPart() == 0)
            System.out.println(n.getRealPart());
        else
            System.out.println(n.getRealPart() + " + " +
                    n.getImaginaryPart() + "i");
    }

}
