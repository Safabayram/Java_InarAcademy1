package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_34 {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);

		while (count <= 2 && count >= -2) {
			int computerNumber = (int) (Math.random() * 3);

			System.out.print("scissor (0), rock (1), paper (2): ");
			int userNumber = input.nextInt();

			switch (computerNumber) {
			case 0:
				if (userNumber == 0) {
					System.out.println("It is a draw");
				} else if (userNumber == 1) {
					System.out.println("You won");
					count++;
				} else if (userNumber == 2) {
					System.out.println("You lost");
					count--;
				}
				break;
			case 1:
				if (userNumber == 0) {
					System.out.println("You lost");
					count--;
				} else if (userNumber == 1) {
					System.out.println("It is a draw");
				} else if (userNumber == 2) {
					System.out.println("You won");
					count++;
				}
				break;
			case 2:
				if (userNumber == 0) {
					System.out.println("You won");
					count++;
				} else if (userNumber == 1) {
					System.out.println("You lost");
					count--;
				} else if (userNumber == 2) {
					System.out.println("It is a draw");
				}
				break;
			}
		}

		if (count > 2) {
			System.out.println("You won more than two times");
		} else {
			System.out.println("The computer won more than two times");
		}

	}

}
