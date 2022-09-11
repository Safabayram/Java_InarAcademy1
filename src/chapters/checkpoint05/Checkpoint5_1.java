package chapters.checkpoint05;

import java.util.Scanner;

public class Checkpoint5_1 {
	public static void main(String[] args) {
		substring();
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
}
