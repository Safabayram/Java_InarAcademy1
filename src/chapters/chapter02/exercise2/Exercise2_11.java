package chapters.chapter02.exercise2;
import java.util.*;

public class Exercise2_11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 System.out.println("enter the number of years: ");
		 
		 int years = input.nextInt();
		 
		 double secondsInYear = 365 * 24 * 60 * 60 ;
		 double birthInYear = secondsInYear / 7;
		 double deathInYear = secondsInYear / 13;
		 double immigrantInYear = secondsInYear / 45;
		 double currentPopulation = 312032486;
		 
		 double populationInYear = currentPopulation + birthInYear + immigrantInYear - deathInYear;
		 
		 System.out.println("the population in "+ years + " years is " +(int) populationInYear * years);
		 
		 
		 
		 
		
		
		
		
				
		
	
		
	}

}
