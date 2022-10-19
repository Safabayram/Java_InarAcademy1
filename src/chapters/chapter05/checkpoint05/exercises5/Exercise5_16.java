package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter an integer");
		int a = input.nextInt();
		int factor = 2;

		while (a > 2) {
			if (a % factor == 0) {
				System.out.println(factor + " ");
				a /= factor;

			} else {
				factor++;
			}

		}

	}
}
