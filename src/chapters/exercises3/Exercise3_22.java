package chapters.exercises3;
import java.util.*;

public class Exercise3_22 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

	    
	    System.out.print("Enter a point with two coordinates: ");
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    
	    double distance = Math.pow(x * x +  y * y, 0.5);
	    
	    if (distance <= 10)
	    
	    	System.out.println("Point (" + x + ", " + y + ") is in the circle");
	    else
	      System.out.println("Point (" + x + ", " + y + ") is not in the circle");
	  }

}
