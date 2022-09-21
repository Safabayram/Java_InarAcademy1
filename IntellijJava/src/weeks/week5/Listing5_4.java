package weeks.week5;

import java.util.Scanner;


public class Listing5_4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 5;
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output = "";

        while (count <= NUMBER_OF_QUESTIONS) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("whats  " + num1 + " - " + num2 + " ? ");
            int answer = input.nextInt();

            if (num1 - num2 == answer) {
                System.out.println("you are correct");
                correctCount++;
            } else {
                System.out.println("your answer wrong");
            }
            count++;

            output += "\n" + num1 + " - " + num2 + " = " + answer +
                    ((num1 - num2 == answer) ? "correct " : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("correct count is " + correctCount + "\nTest time is " + testTime / 1000 + "seconds\n" + output);
    }
}

