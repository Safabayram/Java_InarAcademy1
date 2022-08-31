package chapters.chapters04;

import java.util.Scanner;

public class CaseStudy4_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a hex digit");
		String hexString = input.nextLine();

		if (hexString.length() != 1) {
			System.out.println("you must enter a exactly one character");
			System.exit(0);

		}

		char ch = hexString.toUpperCase().charAt(0);
		int number = 0;
		if (ch <= 'F' && ch >= 'A') {
			System.out.println(number = ch - 'A' + 10);

		} else if ('0' <= 0 && ch <= '9') {
			System.out.println(number = ch - 'A' + 10);

		} else {
			System.err.println("invalid input");
			System.exit(0);
		}

	}

}
