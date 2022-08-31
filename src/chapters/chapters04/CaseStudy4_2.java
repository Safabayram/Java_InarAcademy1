package chapters.chapters04;

public class CaseStudy4_2 {

	public static void main(String[] args) {
		String str = "welcome to java";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(12));
		
		String str2 = "ı love java";
		
		String str3 = str.concat(str2);
		
		System.out.println(str3);
		
		System.out.println(str + str2);
		
		System.out.println(str.toUpperCase());
		
		String str4 = "         asdasdasda        ";
		
		System.out.println(str4.trim());
		
		
		
		
		

	}

}
