package weeks.week_04;

public class IsDublicate {
	public static void main(String[] args) {
		String result = "";
		String str = "safa bayram";
		for(int i = 0 ;i < str.length(); i++ ) {
			char ch = str.charAt(i);
			String c = "" + ch;
			if(result.contains(c) == false) {
				result = result + ch ;
			}
		}
		System.out.println(result);
	}

}
