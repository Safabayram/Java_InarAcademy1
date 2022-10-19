package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String s = input.nextLine();
		String odd ="";
		
		for (int i = 0; i <s.length(); i = i + 2) {
			System.out.print(s.charAt(i));
			
		}
		
		
	}

}
