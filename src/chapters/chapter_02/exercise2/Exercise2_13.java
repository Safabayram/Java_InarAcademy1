package chapters.chapter_02.exercise2;
import java.util.*;

public class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter the monthly saving amount: ");
		
		double savingAmount = input.nextDouble();
		double totalAmount ;
		double interestRate = 1 + 0.00417;
		
		
		
		
		totalAmount = savingAmount * interestRate;
		totalAmount = (totalAmount + savingAmount) * interestRate;
		totalAmount = (totalAmount + savingAmount) * interestRate;
		totalAmount = (totalAmount + savingAmount) * interestRate;
		totalAmount = (totalAmount + savingAmount) * interestRate;
		totalAmount = (totalAmount + savingAmount) * interestRate;
		
		System.out.println("After the sixth month, the account value is " + totalAmount );
		
		
		
	
		
	
		
		
		
	
	}

}
