package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_15 {
	public static void main(String[] args) {
		final int LİNE_NUMBERS = 10;
		int count = 0;

		for (int i = 33; i <= 126; i++) {
			char ch = (char) i;
			count++;
			if (count % 10 == 0) {
				System.out.println(ch);

			} else {
				System.out.print(ch + " ");
			}
		}
	}

}
