package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();

		String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		int numberOfQuarters = cents / 25;
		cents %= 25;

		int numberOfDimes = cents / 10;
		cents %= 10;

		int numberOfNickels = cents / 5;
		cents %= 5;

		System.out.println("Your amount " + amount + " consists of " + numberOfOneDollars + " dollars "
				+ numberOfQuarters + " quarters " + numberOfDimes + " dimes " + numberOfNickels + " nickels "
				+ cents + " pennies ");
	}
}
