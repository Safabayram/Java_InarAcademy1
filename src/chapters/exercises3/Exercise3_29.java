package chapters.exercises3;
import java.util.*;

public class Exercise3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double radius1 = input.nextDouble();
		
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double radius2 = input.nextDouble(); 
		
		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) 
				<= Math.abs(radius1 - radius2))
				System.out.println("circle2 is inside circle1");
			
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)
						<= radius1 + radius2)
				System.out.println("circle2 overlaps circle1");
			
		else
				System.out.println("circle2 does not overlap circle1");

	}
}

