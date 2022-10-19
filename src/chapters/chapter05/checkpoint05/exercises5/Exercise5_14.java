package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int d = n2 > n1 ? n1 : n2;
		
		while (n1 % d != 0 || n2 % d != 0) {
			d--;
		}
		System.out.println("the gcd for " + n1 + " " + n2 + " is " +d);
			
	}

}
