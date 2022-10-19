package chapters.chapters04.exercises4;

import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length from the center to a vertex");
		
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("the area of the pentagon is " + area);
		
		
		
	}

}
