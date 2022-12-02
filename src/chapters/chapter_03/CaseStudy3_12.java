package chapters.chapter_03;

import java.util.*;

public class CaseStudy3_12 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int lottery = (int) (Math.random() * 90) + 10;

		System.out.println("enter your 2 digits guess ");

		int guess = input.nextInt();

		int lotFirstDigit = lottery % 10;

		int lotSecondDigit = lottery / 10;

		int guessFirstDigit = guess % 10;

		int guessSecondDigit = guess / 10;

		System.out.println("lottery number :" + lottery);

		if (lottery == guess) {
			System.out.println("congrulations you won 10000 ");

		}else if (lotFirstDigit == guessSecondDigit && lotSecondDigit == guessFirstDigit) {
			System.out.println("you won 3000");
			
		}else if (lotFirstDigit == guessFirstDigit || lotSecondDigit == guessSecondDigit
				||  lotSecondDigit == guessFirstDigit || lotFirstDigit == guessSecondDigit) {
			System.out.println("you won 1000");
		}
		else {
			System.out.println("you didnt won anything");
		}
			

	}

}
