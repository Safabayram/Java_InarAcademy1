package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int)(amount * 100);

		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

	
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		
		int numberOfPennies = remainingAmount;

		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + 
			((numberOfDollars ==1  || numberOfDollars == 0) ? " dollar" : " dollars"));
		System.out.println(" " + numberOfQuarters + 
			((numberOfQuarters == 1 || numberOfQuarters == 0) ? " quarter" : " quarters"));
		System.out.println(" " + numberOfDimes +
			((numberOfDimes == 1 || numberOfDimes == 0) ? " dime" : " dimes")); 
		System.out.println(" " + numberOfNickels +
			((numberOfNickels == 1 || numberOfNickels == 0)? " nickel" : " nickels"));
		System.out.println(" " + numberOfPennies +
			((numberOfPennies == 1 || numberOfPennies == 0) ? " pennie" : " pennies"));
	}
}
	

