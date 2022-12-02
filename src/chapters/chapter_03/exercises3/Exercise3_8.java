package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		
	
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		 if (num1 > num2) {
		      int temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }

		    if (num2 > num3) {
		      int temp = num2;
		      num2 = num3;
		      num3 = temp;
		    }

		    if (num1 > num2) {
		      int temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }

		    System.out.println("The sorted numbers are "
		      + num1 + " " + num2 + " " + num3);
	}
	
	}
