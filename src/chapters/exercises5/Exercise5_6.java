package chapters.exercises5;

public class Exercise5_6 {
	public static void main(String[] args) {
		System.out.println("miles      kilometers  | kilometers     miles");
		for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
			System.out.println(m + "     " + (m * 1.609) + "     |     " + k + "     " + (k / 1.609));

		}

	}
}
