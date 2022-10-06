package chapters.chapter06.exercise06;


import java.util.Scanner;

public class Exercise6_21 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter n : ");
            long n = input.nextLong();
            System.out.println("Square root of " + n + " is : " + sqrt(n));
        }

        public static double sqrt(long n) {
            double lastGuess = 1 ;
            double nextGuess = (lastGuess + n / lastGuess) / 2 ;
            while (nextGuess - lastGuess > 0.0001) {
                lastGuess = nextGuess ;
                nextGuess = (lastGuess + n / lastGuess) / 2 ;
            }
            return nextGuess ;

        }

}
