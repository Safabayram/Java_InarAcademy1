package chapters.exercises5;

import java.util.Scanner;

public class Exercise5_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a amount");
		double amount = input.nextDouble();

		System.out.println("enter annual interest rate");
		double interestRate = input.nextDouble();

		System.out.println("enter number of months");
		int months = input.nextInt();

		double monthlyInterestRate = interestRate / 1200;

		double valueInAccount = amount * (1 + monthlyInterestRate);

		for (int i = 1; i < months; i++) {

			valueInAccount = (amount + valueInAccount) * (1 + monthlyInterestRate);

		}

		System.out.println("after the " + months + " your value in account will be " + valueInAccount);
	}

}
