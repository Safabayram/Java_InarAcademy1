package weeks_week4;

public class Interview3 {
	public static void main(String[] args) {

	}

	public static void palindrome(String s) {
		boolean isPalindrome = true;
		int l = s.length();
		for (int i = 0; i < l / 2; i++) {
			if(s.charAt(i) != s.charAt(l - 1 - i)){
				isPalindrome = false;
			}
			
			
			
		}
		if(isPalindrome) {
			System.out.println(s + "is a palindrome");
		}
		else {
			System.out.println(s + "is not palindrome");
		}
		
		
	}

}
