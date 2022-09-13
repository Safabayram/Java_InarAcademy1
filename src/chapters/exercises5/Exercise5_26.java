package chapters.exercises5;

import java.util.Iterator;

public class Exercise5_26 {
	public static void main(String[] args) {

		double e = 0;
		double value = 10000;
		for (int i = 1; i <= value; i++) {
			double factor = 1;
			for (int k = i - 1; k >= 1; k--) {
				factor *= k;
			}
			e += 1 / factor;

		}
		System.out.println(e);
		
		value = 20000.0;
		
		for (int i = 1; i < value; i++) {
			double factor = i;
			for (int j = i - 1 ; j >= 1  ; j--) {
				factor *=j;
				
			}
			e += 1 / factor;
			
		} 
		System.out.println(e);
		
		value = 100000;
		
		for (int i = 1; i <= value; i++) {
			double factor = i;
			for (int j = i - 1; j >=1 ; j--) {
				factor*=j;
			}
			e += 1 / factor;
		}
		System.out.println(e);
	}
	
	

}
