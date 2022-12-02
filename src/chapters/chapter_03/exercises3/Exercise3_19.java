package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter three edges ");
		
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if (edge1 +edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
			   System.out.print("The perimeter is " + (edge1 + edge2 + edge3));
			  }
			  else 
			  {
			    System.out.print("The input is invalid");
			  }
				
	
	}
}


