package chapters.chapter_05.exercises5;

public class Exercise5_23 {
	public static void main(String[] args) {
		double n = 50000.0;
		double leftSum = 0;

		for (double i = 1.0; i <= n; i++) {
			leftSum = 1 / i;

		}
		System.out.println(leftSum);
		
		double sumRight = 0;
		for (double i = n; i >= 1.0 ; i--) {
			sumRight = 1 / i;
			
		}
		System.out.println(sumRight);

	}

}
