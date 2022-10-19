package chapters.chapters03.exercises3;

import java.util.*;

public class Exercise3_34 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a year");

		int year = input.nextInt();

		boolean isLeapYear = year % 4 == 0;

		isLeapYear = isLeapYear && year % 100 != 0;

		isLeapYear = isLeapYear || year % 400 == 0;

		if (isLeapYear) {
			System.out.println("the year you have entered is leap year");

		}
		else {
			System.out.println("the year you have entered is not leap year");
		}

	}

}
