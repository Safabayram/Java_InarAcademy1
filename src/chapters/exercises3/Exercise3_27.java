package chapters.exercises3;
import java.util.*;

public class Exercise3_27 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point's x- and y- coordinates: ");
		
		double x = input.nextDouble();
		
		double y = input.nextDouble();
		
		double intersectionx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		
		double intersectiony = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		System.out.println("The point " + ((x > intersectionx || y > intersectiony)
				? "is not " : "is " ) + "in the triangle");
	}
 
}


