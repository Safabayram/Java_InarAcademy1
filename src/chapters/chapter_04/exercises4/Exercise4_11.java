package chapters.chapter_04.exercises4;

import java.util.Scanner;

public class Exercise4_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a decimal value(0 to 15) ");
		int value = input.nextInt();

		if (value < 10)
			System.out.println("The hex value is " + value);
		else if (value >= 10 && value <= 15)
			System.out.println("The hex value is " + (char) (value + 55));
		else
			System.out.println("Invalid input!");

	}

}
