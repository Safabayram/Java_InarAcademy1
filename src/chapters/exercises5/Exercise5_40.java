package chapters.exercises5;

public class Exercise5_40 {
	public static void main(String[] args) {

		int head = 0;
		int tail = 0;

		for (int i = 0; i < 1000000; i++) {
			int number = (int) (Math.random() * 1000000);

			if (number % 2 == 0) {
				head++;
			} else {
				tail++;
			}

		}
		System.out.println("number of head " + head);
		System.out.println("number of tail " + tail);
	}

}
