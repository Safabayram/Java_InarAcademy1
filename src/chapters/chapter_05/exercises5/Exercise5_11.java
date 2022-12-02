package chapters.chapter_05.exercises5;

public class Exercise5_11 {
	public static void main(String[] args) {
		final int LİNE_NUMBERS = 10;
		int divisible = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 5 == 0 || i % 6 == 0) {
				divisible++;
				if (divisible % LİNE_NUMBERS == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}

		}
	}

}
