package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of the bounding circle:");

		double radius = input.nextDouble();
		double angle1 = (Math.PI / 2);
		double angle2 = (Math.PI / 2) + 2 * Math.PI / 5;
		double angle3 = (Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5;
		double angle4 = (Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5 + 2 * Math.PI / 5;
		double angle5 = (Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5 + 2 * Math.PI / 5 + 2 * Math.PI / 5;
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);
		double x4 = radius * Math.cos(angle4);
		double y4 = radius * Math.sin(angle4);
		double x5 = radius * Math.cos(angle5);
		double y5 = radius * Math.sin(angle5);
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.println("Point 1  : ( " + x1 + "," + y1 + ")");
		System.out.println("Point 2  : ( " + x2 + "," + y2 + ")");
		System.out.println("Point 3  : ( " + x3 + "," + y3 + ")");
		System.out.println("Point 4  : ( " + x4 + "," + y4 + ")");
		System.out.println("Point 5  : ( " + x5 + "," + y5 + ")");

	}
}
