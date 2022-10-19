package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter loan amount");
		double amount = input.nextDouble();
		System.out.println("enter number of years");
		int years = input.nextInt();
		System.out.println("enter annual interest rate");
		double annualRate = input.nextDouble();

		double monthlyInterestRate = annualRate / 1200;
		double monthlyPayment = amount * monthlyInterestRate
				/ (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));

		double balance = amount;
		double interest;
		double princibal;

		System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int) (monthlyPayment * 12 * years * 100) / 100.0 + "\n");
		System.out.println("Payment#    Interest     Principal    Balance");

		for (int i = 1; i <= years * 12; i++) {
			interest =(int)(monthlyInterestRate * balance)*100/100;
			princibal = (int)(monthlyPayment - interest)*100/100;
			balance = (int)(balance - princibal)*100/100;
			System.out.println(i + "      " + interest + "      " + princibal + "      " + balance);

		}

	}
}
