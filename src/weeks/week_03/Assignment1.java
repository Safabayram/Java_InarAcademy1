package weeks.week_03;

import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter your salary: ");

		double salary = input.nextDouble();

		System.out.println("enter your year of service: ");

		double yearOfService = input.nextDouble();

		if (yearOfService > 5) {
			System.out.println("your salary wiil be = " + salary + (salary / 100 * 5.0));
			System.out.println("your bonus = " + salary * (5.0 / 100));
		}
		else
			System.out.println("your salary = " + salary);

	}

}
