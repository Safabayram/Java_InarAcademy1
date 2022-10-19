package chapters.chapters04.exercises4;

import java.util.Scanner;

public class Exercise4_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a letter");
		String s = input.next();
		s = s.toUpperCase();
		char letter = s.charAt(0);
		int a = (int) letter;

		if (a >= 65 && a <= 90) {
			if (a <= 67)
				System.out.println("the corresponding number is 2");
			else if (a <= 70)
				System.out.println("the corresponding number is 3");
			else if (a <= 73)
				System.out.println("the corresponding number is 4");
			else if (a <= 76)
				System.out.println("the corresponding number is 5");
			else if (a <= 79)
				System.out.println("the corresponding number is 6");
			else if (a <= 82)
				System.out.println("the corresponding number is 7");
			else if (a <= 85)
				System.out.println("the corresponding number is 8");
			else
				System.out.println("the corresponding number is 9");
		} else {
			System.out.println("invalid input");
		}

	}

}
