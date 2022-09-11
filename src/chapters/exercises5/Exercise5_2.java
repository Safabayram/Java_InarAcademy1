package chapters.exercises5;

import java.util.Scanner;

public class Exercise5_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		while (count <= NUMBER_OF_QUESTIONS) {
			int number = (int) (Math.random() * 16);
			int number1 = (int) (Math.random() * 16);
			System.out.println("whats " + number + "+" + number1 + "?");
			int answer = input.nextInt();

			if (number + number1 == answer) {
				System.out.println("you are correct");
				correctCount++;
			} else {
				System.out.println("your answer is wrong it should be " + (number + number1));
			}
			count++;
			output += "\n" + number + "+" + number1 + "=" + answer
					+ ((number + number1 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

	}

}
