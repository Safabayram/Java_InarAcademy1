package chapters.exercises5;

import java.util.Scanner;

public class Exercise5_51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string : ");
		String s1 = input.nextLine();
		System.out.println("Enter the first string : ");
		String s2 = input.nextLine();

		String prefix = "";
		int i = 0;

		while (s1.charAt(i) == s2.charAt(i)) {

			prefix += s1.charAt(i);
			i++;
		}

		if (prefix.length() > 0) {
			System.out.println("the common prefix is " + prefix);
		} else {
			System.out.println("there are no common  ");
		}

	}

}
