package chapters.chapters03;

import java.util.*;

public class CaseStudy3_13 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter a day number :");
		int day = input.nextInt();

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekday");

			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default:
			System.out.println("error");

		}
		System.out.println("do you want to contiune ");
		String answer = input.next();

		switch (answer.charAt(0)) {

		case 'e':
		case 'E':
			System.out.println("you can contuine");

			break;
		case 'h':
		case 'H':
			System.out.println("you can go out");
			break;

		default:
			System.out.println("invalid input");
			break;
		}

	}

}
