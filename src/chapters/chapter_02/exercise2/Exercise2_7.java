package chapters.chapter_02.exercise2;
import java.util.*;

public class Exercise2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		
		double minutes = input.nextDouble();
		
		double hours = minutes / 60;
		double days = hours / 24;
		double years = days / 365;
		double remainderDay = days % 365;
		 
		
		System.out.println(minutes + " minutes approximately " + years + " years and " + remainderDay +  " days");
		
		
		
	
	}

}
