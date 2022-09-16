package chapters.exercises5;

public class Exercise5_33 {
	public static void main(String[] args) {
		int divisors = 0;
		int numberOfPerfect = 0;

		for (int number = 1; number < 10000; number++) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					divisors += i;

				}

			}
			if(divisors == number) {
				System.out.println(number + "is a perfect number");
				numberOfPerfect++;
			}
			
			divisors = 0;

		}
		System.out.println(numberOfPerfect);

	}

}
