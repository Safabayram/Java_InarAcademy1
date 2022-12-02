package chapters.chapter_04;

import java.util.Scanner;

public class CaseStudy4_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter tw words separated by spacaes");

		String s1 = input.next();
		String s2 = input.next();

		boolean str = s1.equals(s2);

		if (str) {
			System.out.println("two strings equals each other");
		} else {
			System.out.println("two strings not equals each other");

			if (s1.compareTo(s2) == 0) {
				System.out.println("two strings equals each other ");
			} else if (s1.compareTo(s2) > 0) {
				System.out.println("s1 bigger than s2");
			} else {
				System.out.println("s1 smaller than s2");

				System.out.println();

			}
		}

	}

}
