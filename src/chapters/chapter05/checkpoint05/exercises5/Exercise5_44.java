package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double mean = 0;
		double deviation = 0;

		System.out.println("enter ten numbers ");

		for (int i = 1; i <= 10; i++) {
			int number = input.nextInt();
			mean += number;
			deviation += Math.pow(number, 2);

		}
		deviation = Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));

		System.out.println("the mean is " + (mean /= 10));
		System.out.println("the s.d is " + deviation);

	}

}
