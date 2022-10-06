package chapters.chapter06.exercise06;

import java.util.Scanner;

public class Exercise6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        long number = input.nextLong();
        System.out.println("sqrt of number " + number + " is " + sqrt(number));
    }

    public static double sqrt(long number) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + number / lastGuess) / 2;
        while (Math.abs(lastGuess - nextGuess) > 0.00000001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + number / lastGuess) / 2;
        }
        return nextGuess;


    }


}
