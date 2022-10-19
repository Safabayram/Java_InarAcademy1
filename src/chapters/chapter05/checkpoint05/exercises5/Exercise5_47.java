package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the first 12 digits of an ISBN-13 as a string: ");

		String isbn = input.nextLine();
		int checksum = 0;

		for (int i = 0; i < isbn.length(); i++) {
			if (i % 2 == 0) {
				checksum += 3 * Integer.parseInt(isbn.charAt(i) + "");
			} else {
				checksum += Integer.parseInt(isbn.charAt(i) + "");
			}

		}
		checksum = 10 - checksum % 10;

		System.out.println("the isbn number is " + isbn + (checksum == 10 ? 0 : checksum));

	}

}
