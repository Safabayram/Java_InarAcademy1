package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        int[] scores = new int[100];
        int sum = 0;
        int counter = 0;

        int number ;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("enter a score:");
            number = input.nextInt();
            if (number >= 0){
                scores[counter] = number;
                sum += number;
                counter++;
            }
        }while (number >= 0);

        int average = sum / counter;

        int numberOfAbove = 0;
        int numberOfBelow = 0;

        for (int i = 0; i < counter ; i++) {
            if (scores[i] >= average){
                numberOfAbove++;

            }else{
                numberOfBelow++;
            }

        }
        System.out.println("Average is " + average);
        System.out.println("Number of scores above to the average "
                + numberOfAbove);
        System.out.println("Number of scores below the average " + numberOfBelow);


    }

}
