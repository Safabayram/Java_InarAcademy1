package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
		int count = 0;
		int number;

		System.out.println("enter number");

		do {
			number = input.nextInt();
			if (number > max) {
				count = 0;
				max = number;
			}
			if (number == max) {
				count++;

			}
		} while (number != 0);

		System.out.println("max is " + max);
		System.out.println("occurence is " + count);

	}
}
