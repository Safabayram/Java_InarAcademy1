package weeks.week_04;

public class Interview2 {
	public static void main(String[] args) {
		String x = "ı love java";
		interview2(x);
				

	}
	public static void interview2(String s) {
		String result = s.replace('a', 'X');
		result = result.replace('e', 'X');
		result = result.replace('ı', 'X');
		result = result.replace('i', 'X');
		result = result.replace('u', 'X');
		result = result.replace('o', 'X');
		result = result.replace('A', 'X');
		result = result.replace('E', 'X');
		result = result.replace('U', 'X');
		result = result.replace('I', 'X');
		result = result.replace('O', 'X');
		System.out.println(result);
		
		
				
	}

}
