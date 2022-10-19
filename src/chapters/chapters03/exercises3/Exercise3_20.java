package chapters.chapters03.exercises3;
import java.util.*;

public class Exercise3_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit " + "between -58F and 41F: ");
		
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		
		double windSpeed = input.nextDouble();
		
		
		
		if (temperature < -58 || temperature > 41 || windSpeed < 2) {
			
			if (temperature < -58 || temperature > 41)
				System.out.println("Temperature value is not valid");
			
			if (windSpeed < 2)
				System.out.println("Windspeed value is not valid");
			
		} else {
			double windchill = (35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))
					+ (0.4275 * temperature * Math.pow(windSpeed, 0.16)));

			System.out.println("The wind chill index is " + windchill);
		}
	}
}


	

