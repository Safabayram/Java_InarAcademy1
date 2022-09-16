package chapters.exercises5;

import java.util.Iterator;

public class Exercise5_26 {
	public static void main(String[] args) {

		double e = 1;
		double value = 100000;
		for (int i = 10000; i <= value; i = i + 10000) {
			double factor = 1;
			e = 1;
			for (int k = 1; k <= i; k++) {
				factor = factor * (1.0 / k);
				e += factor;
			}
			System.out.println(e);

		}
	}

}
