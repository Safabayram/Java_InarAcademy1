package chapters.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> scores = new ArrayList<>();

        double score;
        double sum = 0;

        do {
            System.out.println("enter a score:");
            score = input.nextDouble();
            scores.add(score);
            sum += score;


        }while (score >= 0);


        double average = sum/ scores.size();

        int numberOfAbove = 0;
        int numberOfBelow = 0;

        for (int i = 0; i <scores.size(); i++) {
            if (scores.get(i) > average){
                numberOfAbove++;

            }else {
                numberOfBelow++;
            }

        }
        System.out.println("Average is " + average);
        System.out.println("Number of scores above to the average "
                + numberOfAbove);
        System.out.println("Number of scores below the average " + numberOfBelow);






















    }



}
