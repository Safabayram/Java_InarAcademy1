package chapters.exercises5;

public class Exercise5_35 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i < 624; i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
			
		}
		System.out.println(sum);
	}

}
