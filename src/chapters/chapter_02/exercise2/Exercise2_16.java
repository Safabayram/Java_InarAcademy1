package chapters.chapter_02.exercise2;
import java.util.*;

public class Exercise2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side ");
		
		double side = input.nextDouble();
		
		double area = 3 * Math.pow(3.0, 0.5) / 2 * Math.pow(side, 2);
		
		System.out.println("the area is " + area);
		
	
	}

}
