package weeks_week4;

public class LiveClass2 {
	public static void main(String[] args) {

		String m = "safa bayram";
		vowelchars(m);

	}

	public static void vowelchars(String s) {
		int l = s.toLowerCase().charAt(0);
		String result = "";

		for (int i = 0; i < l; i++) {
			char ch = s.charAt(i);
			if (ch == 'b' || ch == 's' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'p' || ch == 'j') {
				result = result + s.charAt(i);

			}
			System.out.println(result);

		}
	}
}
