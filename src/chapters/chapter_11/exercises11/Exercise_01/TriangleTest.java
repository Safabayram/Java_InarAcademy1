package chapters.chapter_11.exercises11.Exercise_01;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();


        System.out.print("Enter a color: ");
        String color = input.next();


        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();


        Triangle myTriangle = new Triangle(side1, side2, side3);

        myTriangle.setColor(color);
        myTriangle.setFilled(filled);

        System.out.println(myTriangle.toString());

        System.out.println("Area: " + myTriangle.getArea());

        System.out.println("Perimeter: " + myTriangle.getPerimeter());

        System.out.println("Color: " + myTriangle.getColor());

        System.out.println("Triangle is" + (myTriangle.isFilled() ? "" : " not ")
                + " filled");
    }


}
