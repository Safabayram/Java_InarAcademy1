package chapters.chapter02.exercise2;
import java.util.*;


public class Exercise2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a number between 0 and 1000: ");
		
	    int number = input.nextInt();
	    
	    int unitsDigits = number % 10;
	    number /= 10;
	    int tens = number % 10;
	    number /= 10;
	    int hundreds = number % 10;
	    number /= 10;
	    
	    int sumOfDigits = hundreds + tens + unitsDigits;
	    
	    System.out.println("Sum of digits = " + sumOfDigits);
	    
		
		
		
		
		
		
				
		
	 
	}

}
