package chapters.chapter05.checkpoint05.exercises5;

import java.util.Scanner;

public class Exercise5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number of lines ");
		int numberOfLines = input.nextInt();

		for (int column = 1; column <= numberOfLines; column++) {

			for (int space = numberOfLines - column; space >= 1; space--) {
				System.out.print("  ");

			}
			for (int descending = column; descending >= 2; descending--) {
				System.out.print(descending + " ");

			}
			for (int ascending = 1; ascending <= column; ascending++) {
				System.out.print(ascending + " ");

			}
			System.out.println();

		}
	}

}
