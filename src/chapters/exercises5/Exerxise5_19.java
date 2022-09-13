package chapters.exercises5;

import java.util.Iterator;

public class Exerxise5_19 {
	public static void main(String[] args) {
		int descendStartPoint = 0;
		int lastSpace = 7;
		for (int column = 1; column <= 128; column += column) {
			for (int space = 0; space <lastSpace ; space++) {
				System.out.print("    ");

			}
			for (int ascending = 1; ascending <= column; ascending += ascending) {
				System.out.printf("%4d", ascending);

			}
			for (int descending = descendStartPoint; descending > 0; descending /= 2) {
				System.out.printf("%4d" , descending);

			}
			System.out.println();
			descendStartPoint=column;
			lastSpace--;

		}
	}

}
