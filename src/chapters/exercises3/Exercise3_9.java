package chapters.exercises3;
import java.util.*;

public class Exercise3_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		
		int isbn = input.nextInt();
		
		int digit1 = isbn / 100000000;
		
		int remainingDigits = isbn % 100000000;
		
		int digit2 = remainingDigits / 10000000;
		
		remainingDigits %= 10000000;
		
		int digit3 = remainingDigits / 1000000;
		
		remainingDigits %= 1000000;
		
		int digit4 = remainingDigits / 100000;
		
		remainingDigits %= 100000;
		
		int digit5 = remainingDigits / 10000;
		
		remainingDigits %= 10000;
		
		int digit6 = remainingDigits / 1000;
		
		remainingDigits %= 1000;
		
		int digit7 = remainingDigits / 100;
		
		remainingDigits %= 100;
		
		int digit8 = remainingDigits / 10;
		
		remainingDigits %= 10;
		
		int digit9 = remainingDigits;
		
		
		int digit10 = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 
				 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
		
		
		System.out.println("The ISBN-10 number is " + digit1 + digit2 + digit3 + digit4 + digit5 
				 + digit6 + digit7 + digit8 + digit9);
		
		if (digit10 == 10)
			System.out.print("X");
		
		
		else
			System.out.print(digit10);
		
		
		}
		

}
