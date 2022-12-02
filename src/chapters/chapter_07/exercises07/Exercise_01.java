package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int number = input.nextInt();
        int[] scores = new int[number];

        System.out.println("Enter " + number + " scores: ");
        for (int i = 0; i < scores.length ; i++) {
            scores[i] = input.nextInt();

        }
        displayGrade(scores);

    }

    private static void displayGrade(int[] scores) {
        int topScore = getTopScore(scores);
        for (int i = 0; i <scores.length ; i++) {
            char grade = getGrade(scores[i], topScore);
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + grade);

        }
    }

    private static char getGrade(int score, int topScore) {
        if (score >= topScore - 10) {
            return 'A';
        } else if (score >= topScore - 20) {
            return 'B';
        } else if (score >= topScore - 30) {
            return 'C';
        } else {
            return 'D';
        }



    }

    private static int getTopScore(int[] scores) {
        int top = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > top) {
                top = scores[i];
            }
        }
        return top;

    }


}
