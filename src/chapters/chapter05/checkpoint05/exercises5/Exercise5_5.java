package chapters.chapter05.checkpoint05.exercises5;

public class Exercise5_5 {
	public static void main(String[] args) {
		System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			System.out.println(k + "		" + ((k * 2.2)*10)/10 + "	|	" + p + "	   " +((p / 2.2)*10)/10);
		}

	}

}
