package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number of students");
		int numberOfStudents = input.nextInt();
		int count = 0;
		double highest = 0;
		String highestname = "";
		

		while (count < numberOfStudents) {
			System.out.println("enter students name and score");
			String name = input.next();
			double score = input.nextDouble();
			if (score > highest) {
				highest = score;
				highestname  = name;
				
			} else {
				highest = highest;
			}
			count++;
		}
		System.out.println("student of highest score  " + highestname + "  "+ highest);

	}
}
