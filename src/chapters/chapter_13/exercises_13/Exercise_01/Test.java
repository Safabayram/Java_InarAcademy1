package chapters.chapter_13.exercises_13.Exercise_01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();


        Triangle myTriangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println(myTriangle);


    }
}
