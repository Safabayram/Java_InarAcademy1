package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double commission = 0;
		int salesAmount = 1;

		System.out.println("enter a commission ");

		double wantedCommission = input.nextDouble();

		for (salesAmount = 1; commission < wantedCommission; salesAmount++) {

			if (salesAmount > 10000) {
				commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;

			} else if (salesAmount > 5000) {
				commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;

			} else {
				commission = salesAmount * 0.08;

			}

		}
		System.out.println("for " + wantedCommission + " the sales amount must be  " + salesAmount);

	}

}
