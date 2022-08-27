package weeks.week_03;

import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("enter 4 digit numbers : ");
		
		int digit = input.nextInt();
		
		System.out.print(digit % 10 + " " + (digit / 10) % 10 +" " + (digit / 100) % 10 + " " + (digit / 1000));
		
		
		
		
		
	}

}
