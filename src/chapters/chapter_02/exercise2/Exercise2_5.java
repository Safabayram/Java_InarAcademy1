package chapters.chapter_02.exercise2;
import java.util.*;

public class Exercise2_5 {
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values of subtotal and gratuity rate : ");
		
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal / 100 * gratuityRate;
		double total = subtotal + gratuity;
		
		System.out.println("gratuity = " + gratuity + " and total = " + total);
		
		
	}

}
