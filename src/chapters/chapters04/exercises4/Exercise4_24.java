package chapters.chapters04.exercises4;

import java.util.Scanner;

public class Exercise4_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the first city: ");

		String c1 = input.nextLine();
		c1 = c1.toUpperCase();

		System.out.println("enter the second city: ");

		String c2 = input.nextLine();
		c2 = c2.toUpperCase();
		System.out.println("enter the third city: ");

		String c3 = input.nextLine();
		c3 = c3.toUpperCase();

		String temp;
		if ((c2.compareTo(c1) < 0) && (c2.compareTo(c3) < 0)) {
			temp = c1;
			c1 = c2;
			c2 = temp;
		} else if ((c3.compareTo(c1) < 0) && (c3.compareTo(c2) < 0)) {
			temp = c1;
			c1 = c3;
			c3 = temp;

		}
		if (c3.compareTo(c2) < 0) {
			temp = c2;
			c2 = c3;
			c3 = temp;
		}

		System.out.println("The three cities in alphabetical order are " + c1 + " " + c2 + " " + c3);
	}
}