package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a string");

		String s = input.nextLine();

		int uppercase = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				uppercase++;
			}

		}
		System.out.println("number of uppercase  " + uppercase);

	}

}
