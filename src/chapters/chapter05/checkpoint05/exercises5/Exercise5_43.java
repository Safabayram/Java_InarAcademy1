package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_43 {
	public static void main(String[] args) {
		int count = 0;

		for (int num1 = 1; num1 <= 7; num1++) {
			for (int num2 = num1 + 1; num2 <= 7; num2++) {
				System.out.println(num1 + "  " + num2);
				count++;
			}

		}
		System.out.println("count is " + count);
	}

}
