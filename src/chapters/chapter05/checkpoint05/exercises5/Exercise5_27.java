package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_27 {
	public static void main(String[] args) {
		int numberOfLines = 10;
		int yearCounts = 0;

		for (int year = 101; year < 2100; year++) {

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				yearCounts++;
				if (yearCounts % numberOfLines == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}

			}

		}
	}

}
