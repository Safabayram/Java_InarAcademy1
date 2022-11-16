package chapters.chapter11.exercises11.Exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        ArrayList<Integer> answers = new ArrayList<Integer>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        answers.add(answer);

        while (number1 + number2 != answer) {
            System.out.print(
                    "Try again! What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                answers.add(answer);
            }
        }

        System.out.println("You got it!");
    }


}

