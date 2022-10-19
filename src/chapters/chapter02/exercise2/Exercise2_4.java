package chapters.chapter02.exercise2;
import java.util.*;

public class Exercise2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds = ");
		
		double pounds = input.nextDouble();
		
		double kilogram = pounds * 0.454;
		
		System.out.println(pounds + " pounds = " + kilogram + " kilograms ");
	}

}
