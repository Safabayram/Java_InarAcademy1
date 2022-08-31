package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a letter grade ");
		String s = input.next();
		s = s.toUpperCase();
		char grade = s.charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("the numeric value of grade is 4 ");
			break;
		case 'B':
			System.out.println("the numeric value of grade is 3");
			break;
		case 'C':
			System.out.println("the numeric value of grade is 2");
			break;
		case 'D':
			System.out.println("the numeric value of grade is 1");
			break;
		case 'F':
			System.out.println("the numeric value of grade is 1");
			break;

		default:
			System.err.println("invalid grade");
			break;
		}

	}

}
