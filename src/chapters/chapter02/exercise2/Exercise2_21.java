package chapters.chapter02.exercise2;
import java.util.*;

public class Exercise2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		
		double interestRate = input.nextDouble() / 1200;
		
		System.out.println("Enter number of years: ");
		
		double years = input.nextDouble();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + interestRate), years * 12);
		
		System.out.println("Accumulated value is " + futureInvestmentValue);
	}

}
