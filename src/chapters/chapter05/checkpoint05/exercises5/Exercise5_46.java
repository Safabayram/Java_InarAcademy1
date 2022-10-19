package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a string ");

		String s = input.next();

		String reverse = "";

		for (int i = 0; i < s.length(); i++) {

			reverse = s.charAt(i) + reverse;

		}
		System.out.println(reverse);

	}

}
