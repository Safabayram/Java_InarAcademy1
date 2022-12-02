package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter annual percentage yield: ");
		double percentageYield = input.nextDouble();

		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();

		System.out.println("Month  CD Value");

		for (int i = 1; i < months; i++) {
			amount += amount * (percentageYield / 1200);

			System.out.printf("%-7d%.2f\n", i, amount);

		}
	}

}
