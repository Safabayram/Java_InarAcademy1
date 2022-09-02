package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");

		String name = input.nextLine();

		System.out.println("Enter number of hours worked in a week:");

		double hours = input.nextDouble();

		System.out.println("Enter hourly pay rate ");

		double payRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate: ");

		double federalRate = input.nextDouble();

		System.out.println("Enter state tax withholding rate: ");

		double stateRate = input.nextDouble();

		double grossPay = hours * payRate;
		double federalWithholding = grossPay * federalRate;
		double stateWithholding = grossPay * stateRate;
		double totalDeduction = federalRate + stateRate;
		double netPay = grossPay - totalDeduction;

		System.out.println("Employee Name:   " + name);
		System.out.println("Hours Worked:  " + hours);
		System.out.println("Pay Rate:   " + "$" + payRate);
		System.out.println("Gross Pay:  " + "$" + grossPay);
		System.out.println("Deductions");
		System.out.println("\tFederal Withholding" + "(" + federalRate + ")" + "$" + federalWithholding);
		System.out.println("\tState Withholding" + "(" + stateRate + ")" + "$" + stateWithholding);
		System.out.println("\tTotal Deductions" + "$" + totalDeduction);
		System.out.println("Net Pay " + "$" + netPay);

	}

}
