package chapters.exercises3;
import java.util.*;

public class Exercise3_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 int number = (int)(Math.random() * 2);
		 
		 System.out.print("Guess head or tail? " +
			      "Enter 0 for head and 1 for tail: ");
		 
		 int guess = input.nextInt();
		 
		 if (guess == number)
		      System.out.println("Correct guess");
		    else 
		      System.out.println("Sorry");
		 
		 
	}
	

}
