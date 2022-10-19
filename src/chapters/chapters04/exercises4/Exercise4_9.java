package chapters.chapters04.exercises4;

import java.util.Scanner;

public class Exercise4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a character: ");
		
		String key = input.next();
		
		char ch = key.charAt(0);
		
		System.out.println(ch + "s unicode is  " + (int)ch);
		
		
		
		
	}

}
