package chapters.chapter_04.exercises4;

public class Exercise4_25 {
	public static void main(String[] args) {

		int digits = (int) (1000 + (Math.random() * 9000));

		int letter1 = (int) (65 + (Math.random() * (90 - 25)));
		int letter2 = (int) (65 + (Math.random() * (90 - 25)));
		int letter3 = (int) (65 + (Math.random() * (90 - 25)));

		System.out.println(
				"your vehicle plate number is " + digits + (char) (letter1) + ((char) (letter2)) + ((char) (letter3)));

	}

}
