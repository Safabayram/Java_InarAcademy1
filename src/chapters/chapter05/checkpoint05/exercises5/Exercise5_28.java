package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter the first day of the year: ");
		int firstDay = input.nextInt();

		int daysInMonth = 0;

		for (int month = 1; month < 12; month++) {

			switch (month) {
			case 1:
				System.out.print("january 1 " + year + " is ");
				daysInMonth = 31;

				break;
			case 2:
				System.out.print("february 1 " + year + " is");
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					daysInMonth = 29;
				else
					daysInMonth = 28;

				break;
			case 3:
				System.out.print("march 1, " + year + " is ");
				daysInMonth = 31;
				break;
			case 4:
				System.out.print("april 1, " + year + " is ");
				daysInMonth = 30;
				break;
			case 5:
				System.out.print("may 1, " + year + " is ");
				daysInMonth = 31;
				break;
			case 6:
				System.out.print("june 1, " + year + " is ");
				daysInMonth = 30;
				break;
			case 7:
				System.out.print("july 1, " + year + " is ");
				daysInMonth = 31;
				break;
			case 8:
				System.out.print("august 1, " + year + " is ");
				daysInMonth = 31;
				break;
			case 9:
				System.out.print("september 1, " + year + " is ");
				daysInMonth = 30;
				break;
			case 10:
				System.out.print("october 1, " + year + " is ");
				daysInMonth = 31;
				break;
			case 11:
				System.out.print("november 1, " + year + " is ");
				daysInMonth = 30;
				break;
			case 12:
				System.out.print("december 1, " + year + " is ");
				daysInMonth = 31;
				break;
			}
			switch (firstDay) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;

			}
			firstDay = (firstDay + daysInMonth) % 7;

		}

	}
}
