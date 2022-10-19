package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_39 {
	public static void main(String[] args) {
		double aim = 30000 - 5000;

		double commission = 5000 * 0.08;
		commission += 10000 * 0.10;

		double salesAmount = 10000.01;

		do {
			salesAmount += 0.01;
			commission = salesAmount * 0.12;

		} while (commission <= aim);

		System.out.println("for " + aim + "$ you must earn " + salesAmount);

	}

}
