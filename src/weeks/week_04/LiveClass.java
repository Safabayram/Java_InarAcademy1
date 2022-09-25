package weeks.week_04;

public class LiveClass {
	public static void main(String[] args) {
		trim();
	}

	public static void length() {
		String temp = "ı love ınar academy";
		int length = temp.length();

		System.out.println(length);
	}

	public static void substring() {
		String temp = "ınar academy";
		String sub = temp.substring(3, 9);
		System.out.println(temp);
		System.out.println(sub);

	}

	public static void equalsIgnoreCase() {
		String temp = "ınar academy";
		String temp1 = "INAR ACADEMY";

		System.out.println(temp.equalsIgnoreCase(temp1));

	}
	public static void contains() {
		String temp = "safa bayram";
		String temp1= "safa";
		
		System.out.println(temp.contains(temp1));
	}
	public static void trim() {
		String temp =  "   ı   nar academy   ";
		System.out.println(temp.trim());
	}
	public static void charAt() {
		String temp = "safa bayram";
		System.out.println(temp.charAt(9));
	}
	public static void toUpperCase() {
		String temp = "safa bayram";
		System.out.println(temp.toUpperCase());
	}
	public static void toLowerCase(){
		String temp = "SAFA bayram";
		System.out.println(temp.toLowerCase());
	}

}
