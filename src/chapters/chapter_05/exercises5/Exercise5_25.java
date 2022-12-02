package chapters.chapter_05.exercises5;

public class Exercise5_25 {
	public static void main(String[] args) {
		double sum = 0;
		double piValue = 10000.0;

		for (double i = 1.0; i <= 2 * piValue - 1; i += 2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;

		}
		System.out.println(sum);
		
		piValue = 20000.0;
		for (double i = 1.0; i <= 2 * piValue - 1 ; i+=2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
			
		}
		System.out.println(sum);
		
		piValue = 10000000.0;
		
		for (int i = 1; i < 2 * piValue - 1; i+=2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
			
		}
		System.out.println(sum);
	}

}
