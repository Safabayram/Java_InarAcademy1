package chapters.exercises5;

import java.util.Scanner;

public class Exercise5_37 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter a decimal number");

		int decimal = input.nextInt();

		String binary = "";
		for (int i = decimal; i >= 1 ; i /= 2) {
			binary = (i % 2) + binary;

		}
		System.out.println(binary);
	
	}

}
