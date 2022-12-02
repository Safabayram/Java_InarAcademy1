package chapters.chapter_04.exercises4;

import java.util.Scanner;

public class Exercise4_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a string");

		String s = input.next();

		System.out.println(s.length());
		System.out.println(s.charAt(0));
	}

}
