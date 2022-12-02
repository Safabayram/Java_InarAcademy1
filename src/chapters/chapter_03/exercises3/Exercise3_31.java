package chapters.chapter_03.exercises3;
import java.util.*;
public class Exercise3_31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convertType = input.nextByte();

		if (convertType == 0) {
			System.out.println("Enter the dollar amount: ");
			double dollarAmount = input.nextDouble();

			System.out.println(dollarAmount + "$ is " + (dollarAmount * exchangeRate) + " yuan");
		} else if (convertType == 1) {
			System.out.println("Enter the RMB amount: ");
			double rmbAmount = input.nextDouble();
			
			System.out.println(rmbAmount + " yuan is $" + (rmbAmount / exchangeRate));
		}
	}
}


	