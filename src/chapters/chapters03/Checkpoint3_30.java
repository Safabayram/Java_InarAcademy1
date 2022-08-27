package chapters.chapters03;

public class Checkpoint3_30 {
public static void main(String[] args) {
		
		int x = 3;
		int y = 3;
		
		
		switch (x + 3) {
		case 6: y = 1; break;
		default: y += 1; break;
		}
		
		System.out.println(x);
		System.out.println(y);
		
		x = y = 3 ;
		
		if(x + 3 == 6) {
			y = 1;
		
		}
		else y += 1;
		
		System.out.println(x);
		System.out.println(y);
	}
	}


