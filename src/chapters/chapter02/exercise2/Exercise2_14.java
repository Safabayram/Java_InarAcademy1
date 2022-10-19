package chapters.chapter02.exercise2;
import java.util.*;

public class Exercise2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		
		double kg = input.nextDouble() * 0.45359237;
		
		System.out.println("Enter height in inches: ");
		
		double meters = input.nextDouble() * 0.0254;
		
		double bmı = kg / Math.pow(meters, 2);
		
		System.out.println("your bmı is " +(int) (bmı * 100000) / 100000);
		
		
		
	}

}
