package chapters.chapters03;

import java.util.Scanner;

public class Checkpoint3_29 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a weight and a height :");
		
		int weight = input.nextInt();
		int height = input.nextInt();
		
		System.out.println(weight > 50 ^ height > 60);

}
}
