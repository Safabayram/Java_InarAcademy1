package chapters.chapter_04.exercises4;

import java.util.Scanner;

public class Exercise4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
		
		System.out.println("The area of the polygon is " + area);
		
	}

}
