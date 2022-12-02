package chapters.chapter_02.exercise2;
import java.util.*;

public class Exercise2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		
		double kg = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		
		double finalTemperature = input.nextDouble();
		
		double Q = kg * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + Q);
		
		
	}
	


}
