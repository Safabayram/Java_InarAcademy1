package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters: ");

		String s = input.next();

		s = s.toUpperCase();

		char code = s.charAt(0);

		if (code == 'M')
			System.out.println("Mathematics");
		else if (code == 'C')
			System.out.println("Computer Science");
		else if (code == 'I')
			System.out.println("Information Technology");
		else
			System.out.println("ivalid input");

		char number = s.charAt(1);

		if (number == '1')
			System.out.println("freshman");
		else if (number == '2')
			System.out.println("sophomore");
		else if (number == '3')
			System.out.println("junior");
		else if (number == '4')
			System.out.println("senior");
		else
			System.out.println("invalid input");

	}

}
