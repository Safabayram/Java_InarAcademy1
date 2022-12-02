package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudent = input.nextInt();
        String[] students = new String[numberOfStudent];
        int[] scores = new int[students.length];


        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }


        sort(students, scores);


        for (String e: students) {
            System.out.println(e);
        }
    }

    public static void sort(String[] stu, int[] score) {
        for (int i = 0; i < score.length - 1 ; i++) {
            int max = score[i];
            int maxIndex = i;
            String temp;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] > max){
                    max = score[j];
                    maxIndex = j;
                }

            }
            if (maxIndex != i){
                temp = stu[i];
                stu[i] = stu[maxIndex];
                stu[maxIndex] = temp;

                score[maxIndex] = score[i];
                score[i] = max;

            }
        }


    }

}
