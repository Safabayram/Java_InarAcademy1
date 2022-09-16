package chapters.exercises5;

import java.util.Scanner;

public class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a string ");

		String s = input.nextLine();
		s = s.toLowerCase();

		int vowel = 0;
		int consonants = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'u' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'ı'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o') {
				vowel++;
			} else {
				consonants++;
			}

		}
		System.out.println("number of vowels " + vowel);
		System.out.println("number of consonants " + consonants);

	}

}
