package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_2 {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + 
			      " = " + answer);
				
	}
	


}
