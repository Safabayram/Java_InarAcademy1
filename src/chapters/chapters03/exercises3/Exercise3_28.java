package chapters.chapters03.exercises3;
import java.util.*;

public class Exercise3_28 {
	
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);

	    
		System.out.print("Enter r1s center x-, y-coordinates, width, and height: ");
	    
		double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    double weight1 = input.nextDouble();
	    double height1 = input.nextDouble();

	    System.out.print("Enter r2s center x-, y-coordinates, width, and height: ");
	    
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble();
	    double weight2 = input.nextDouble();
	    double height2 = input.nextDouble();
	    
	    double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
	    double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;
	    
	    if (xDistance <= (weight1 - weight2) / 2 && yDistance <= (height1 - height2) / 2)
	      System.out.println("r2 is inside r1");
	    else if (xDistance <= (weight1 + weight2) / 2 && yDistance <= (height1 + height2) / 2)
	      System.out.println("r2 overlaps r1");
	    else
	      System.out.println("r2 does not overlap r1");
	}
}

