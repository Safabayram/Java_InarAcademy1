package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter an ASCII code ");

		int code = input.nextInt();

		if (code < 128) {
			char ch = (char) code;
			System.out.println("the character of ASCII code is " + ch);

		} else {
			System.err.println("invalid input");
		}

	}

}
