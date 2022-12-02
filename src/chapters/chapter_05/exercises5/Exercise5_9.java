package chapters.chapter_05.exercises5;

import java.util.Scanner;

public class Exercise5_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // HASNT FİNİSHED YET

		System.out.println("enter the number of students");
		int numberOfStudents = input.nextInt();
		double firstScore = 0;
		double secondScore = 0;
		String highestName = "";
		String shighestName = "";
		int count = 0;
		while (count < numberOfStudents) {
			System.out.println("enter the name and score");
			double score = input.nextDouble();
			String name = input.next();
			if (score > firstScore) {
				firstScore = score;
				highestName = name;
			} else if (secondScore > firstScore) {

				firstScore = secondScore; 
				highestName = name;
			} else {
				secondScore = secondScore;
				shighestName = name;

			}
			count++;
		}
		System.out.println("first score " + highestName + " " + firstScore);
		System.out.println("second score  " + shighestName + " " + secondScore);
	}

}
