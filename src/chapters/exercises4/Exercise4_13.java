package chapters.exercises4;

import java.util.Scanner;

public class Exercise4_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a letter ");
		
		String s = input.next();
		
		char letter = s.charAt(0);
		
		if (Character.isLetter(letter))
		{
			switch(Character.toUpperCase(letter))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(letter + " is a vowel"); break;
				default : System.out.println(letter + " is a consonant"); 
			}
		}
		else
			System.out.println(letter + " is an invalid input");
	}
	

}
