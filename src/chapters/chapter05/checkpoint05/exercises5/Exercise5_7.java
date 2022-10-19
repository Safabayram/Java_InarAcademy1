package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_7 {
	public static void main(String[] args) {
		double tuition = 10000;
		double increase = 0.05;
		int year = 10;
		double amount = 0;

		for (int i = 1; i <= year; i++) {
			tuition += tuition * increase;

		}
		System.out.println(year + " amount is " + tuition);

		for (int i = 0; i <= 14; i++) {
			tuition += tuition * increase;

		}
		System.out.println("4 year total cost is " + tuition);

	}

}
