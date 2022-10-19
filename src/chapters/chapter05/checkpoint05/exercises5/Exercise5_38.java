package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal integer");
		int decimal = input.nextInt();

		String octal = "";

		for (int i = decimal; i > 0; i /= 8) {
			octal = (i % 8) + octal;

		}
		System.out.println(octal);
	}

}
