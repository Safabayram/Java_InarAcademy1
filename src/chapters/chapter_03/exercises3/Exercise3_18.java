package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_18 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter package weight: ");
	    
		double weight = input.nextDouble();
	    
		   if (weight <= 1) {
		      System.out.println("The shipping cost is $3.5");
		    }
		    else if (weight <= 3) {
		      System.out.println("The shipping cost is $5.5");
		    }     
		    else if (weight<= 10) {
		      System.out.println("The shipping cost is $8.5");
		    }     
		    else if (weight <= 20) {
		      System.out.println("The shipping cost is $10.5");
		    }     
		   
		     else if (weight >= 50) {
		      System.out.println("The package cannot be shipped");
		     }
		     else {
		    	 System.out.println("the package cannot be shipped");
		     }
		    
	}
}
	

	
	


