package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_32 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int first = (int) (Math.random() * 10);

		int second = (int) (Math.random() * 10);

		while (first == second) {

			second = (int) (Math.random() * 10);

		}

		System.out.println("enter two digits guess");

		int guess = input.nextInt();

		if (guess / 10 == first && guess % 10 == second) {
			System.out.println("Exact match: you win $10,000");
		} else if (guess % 10 == first && guess / 10 == second) {
			System.out.println("Match all digits: you win $3,000");
		} else if (guess % 10 == first || guess % 10 == second || guess / 10 == first || guess / 10 == second) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("no match");
		}

	}

}
