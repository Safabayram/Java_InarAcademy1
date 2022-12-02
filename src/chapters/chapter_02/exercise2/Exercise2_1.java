package chapters.chapter_02.exercise2;
import java.util.*;
public class Exercise2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in celcius: ");
		double celcius = input.nextDouble();
		
		double fahrenheit = 9 / 5 * celcius + 32;
		System.out.println(celcius + " celcius " + " equivalent to " + fahrenheit + " fahrenheit ");
	}

}
