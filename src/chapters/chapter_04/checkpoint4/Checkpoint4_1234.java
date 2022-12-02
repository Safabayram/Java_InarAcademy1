package chapters.chapter_04.checkpoint4;

public class Checkpoint4_1234 {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sin(2 * Math.PI));
		System.out.println(Math.max(2, Math.min(3, 4)));
		System.out.println(Math.max(2, Math.min(3, 4)));
		System.out.println(Math.ceil(-2.5));
		System.out.println(Math.floor(-2.5));
		System.out.println(Math.round(-2.5f));
		
		double x = Math.toRadians(47);
		System.out.println(x);
		
		double y = Math.toDegrees(Math.PI / 7);
		System.out.println(y);
		
		double z = 33 + (int)(Math.random() * 23);
		
		System.out.println(z);
		
		double m =(int)(Math.random() * 1000);
		
		System.out.println(m);
		
		double s = 5.4 + (Math.random() * 51.1);
		
		System.out.println(s);
		
	}

}
