package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exerxise5_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the loan amount");
		double amount = input.nextDouble();

		System.out.println("enter the number of years");
		int years = input.nextInt();

		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		for (double interestRate = 5.0; interestRate < 8; interestRate += 0.125) {
			System.out.printf("-%5.3f", interestRate);
			System.out.print("%       ");
			double monthlyİnterestRate = interestRate / 1200;
			double monthlyPayment = amount * monthlyİnterestRate
					/ (1 - 1 / Math.pow(1 + monthlyİnterestRate, years * 12));
			System.out.print("    " + monthlyPayment);
			System.out.println("    " + monthlyPayment * 12 * years);

		}

	}

}
