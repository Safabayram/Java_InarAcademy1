package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string s1");
		
		String s1 = input.nextLine();
		
		System.out.println("enter a string s2");
		
		String s2 = input.nextLine();
		
		if(s1.contains(s2))
			System.out.println(s2 + "    substring of " + s1);
		else
			System.out.println(s2 + "    not substring of   " + s1);
	}

}
