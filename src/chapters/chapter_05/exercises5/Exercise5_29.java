package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first day of the year : ");
		int firstDayOfTheYear = input.nextInt();
		System.out.println("Enter the year : ");
		int year = input.nextInt();
		int day = firstDayOfTheYear;
		int numberOfDaysInmonth = 0;
		for (int i = 0; i < 12; i++) {
			String month = "";
			switch (i) {
			case 0:
				month = "January";
				numberOfDaysInmonth = 31;
				break;
			case 1:
				month = "February";
				numberOfDaysInmonth = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
				break;
			case 2:
				month = "March";
				numberOfDaysInmonth = 31;
				break;
			case 3:
				month = "April";
				numberOfDaysInmonth = 30;
				break;
			case 4:
				month = "May";
				numberOfDaysInmonth = 31;
				break;
			case 5:
				month = "June";
				numberOfDaysInmonth = 30;
				break;
			case 6:
				month = "July";
				numberOfDaysInmonth = 31;
				break;
			case 7:
				month = "August";
				numberOfDaysInmonth = 31;
				break;
			case 8:
				month = "September";
				numberOfDaysInmonth = 30;
				break;
			case 9:
				month = "October";
				numberOfDaysInmonth = 31;
				break;
			case 10:
				month = "November";
				numberOfDaysInmonth = 30;
				break;
			case 11:
				month = "December";
				numberOfDaysInmonth = 31;
			}

			System.out.printf("%16s%-10s2013", " ", month);
			System.out.println();
			System.out.println("---------------------------------------------------");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			int firstDayOfTheMonth = 0;
			switch (i) {
			case 0:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 1:
				firstDayOfTheMonth = day % 7;
				day += ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
				break;
			case 2:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 3:
				firstDayOfTheMonth = day % 7;
				day += 30;
				break;
			case 4:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 5:
				firstDayOfTheMonth = day % 7;
				day += 30;
				break;
			case 6:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 7:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 8:
				firstDayOfTheMonth = day % 7;
				day += 30;
				break;
			case 9:
				firstDayOfTheMonth = day % 7;
				day += 31;
				break;
			case 10:
				firstDayOfTheMonth = day % 7;
				day += 30;
				break;
			case 11:
				firstDayOfTheMonth = day % 7;
			}

			for (int space = 0; space < firstDayOfTheMonth; space++) {
				System.out.print("      ");
			}

			int count = firstDayOfTheMonth;
			for (int days = 1; days<= numberOfDaysInmonth; days++) {
				if (count % 7 == 0) {
					System.out.println();
					System.out.printf("%3d", days);
				} else {
					System.out.printf("%3d", days);
				}
				System.out.print("   ");
				count++;
			}
			System.out.println();
			
		}
	}
}
