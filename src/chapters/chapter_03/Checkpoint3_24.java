package chapters.chapter_03;

public class Checkpoint3_24 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("enter three number ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
		}
	}

