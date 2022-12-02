package chapters.chapter_05.exercises5;

public class Exercise5_18 {
	public static void main(String[] args) {

		System.out.println(" Pattern B ");
		for (int column = 6; column >= 1; column--) {
			System.out.println();
			for (int row = 1; row <= column; row++) {
				System.out.print(row + " ");

			}

		}

		System.out.println("\nPattern A ");
		for (int column = 1; column <= 6; column++) {
			System.out.println();

			for (int row = 1; row <= column; row++) {
				System.out.print(row + " ");

			}

		}

		System.out.println("\nPattern C ");
		int lines = 6;
		for (int column = 1; column <= lines; column++) {

			for (int space = lines - column; space >= 1; space--) {
				System.out.print("  ");

			}
			for (int ascending = 1; ascending <= column; ascending++) {
				System.out.print(ascending + " ");

			}
			System.out.println();

		}
		int line = 6;
		System.out.println("\nPattern D");

		for (int column = 0; column < line; column++) {
			for (int space = 0; space < column; space++) {
				System.out.print("  ");
			}
			for (int ascending = 0; ascending < line - column; ascending++) {
				System.out.print((ascending + 1) + " ");

			}
			System.out.println();

		}
		

	}

}
