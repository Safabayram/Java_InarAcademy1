package chapters.chapters03.exercises3;
import java.util.*;

public class Exercise3_1 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		

		System.out.print("Enter a, b, c: ");
		
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = Math.pow(b, 2) - 4 * a * c;

		System.out.print("The equation has ");
		if (discriminant > 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
			System.out.println("two roots " + root1 + " and " + root2);
		}
		else if (discriminant == 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("one root " + root1);
		}
		else
			System.out.println("no real roots");
	}
}


