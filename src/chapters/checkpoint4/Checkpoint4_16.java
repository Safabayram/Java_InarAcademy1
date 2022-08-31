package chapters.checkpoint4;

public class Checkpoint4_16 {
	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "WELCOME to Java";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s1.indexOf('t'));
		
		System.out.println(s1.substring(5));
		
		String s4 = s1 + s2 + s3;
		
		System.out.println(s4);
		
		boolean isequal = s1.equals(s3);
		
		System.out.println("is s1 and s2 equal? " + isequal);
		
		int o = s1.compareToIgnoreCase(s3);
		
		System.out.println(o);
		
		String s5 = s1.substring(1, 4);
		
		System.out.println(s5);
		
		
				
				
		
		
		
		
	}

}
