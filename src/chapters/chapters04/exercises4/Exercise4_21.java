package chapters.chapters04.exercises4;

import java.util.Scanner;

public class Exercise4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a SSN :");

		String ssn = input.nextLine();

		char digit1 = ssn.charAt(0);
		char digit2 = ssn.charAt(1);
		char digit3 = ssn.charAt(2);
		char digit4 = ssn.charAt(3);
		char digit5 = ssn.charAt(4);
		char digit6 = ssn.charAt(5);
		char digit7 = ssn.charAt(6);
		char digit8 = ssn.charAt(7);
		char digit9 = ssn.charAt(8);

		if (ssn.length() == 9) {
			if (Character.isDigit(digit9) && Character.isDigit(digit8) && Character.isDigit(digit7)
					&& Character.isDigit(digit6) && Character.isDigit(digit5) && Character.isDigit(digit4)
					&& Character.isDigit(digit3) && Character.isDigit(digit2) && Character.isDigit(digit1))
				System.out.println(ssn + " is a valid ssn number);");
			else
				System.out.println(ssn + "invalid ssn number");

		}

	}
}
