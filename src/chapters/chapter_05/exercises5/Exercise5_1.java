package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter an integer input ends if it is 0");
		int number = input.nextInt();
		int countPositive = 0;
		int countNegative = 0;
		double sum = 0;
		double average;
		int count= 0;

		if (number == 0) {
			System.out.println("invalid input");
			System.exit(1);
		}

		while (number != 0) {

			if (number > 0) {
				countPositive++;
			} else {
				countNegative++;
			}
			sum += number;
			number = input.nextInt();
			count ++;

		}

		average = sum / count;
		System.out.println("sum is" + sum);
		System.out.println("average is " + average);

		System.out.println("positive numbers" + countPositive);
		System.out.println("negative number" + countNegative);

	}

}
