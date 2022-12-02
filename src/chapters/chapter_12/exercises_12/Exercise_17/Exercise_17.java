package chapters.chapter_12.exercises_12.Exercise_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) throws FileNotFoundException {
        char yesOrNo;
        ArrayList<String> words = new ArrayList<>();
        File sourceFile = new File("hangman.txt");
        try (
                Scanner fileWords = new Scanner(sourceFile);
        ) {
            while (fileWords.hasNext()) {
                words.add(fileWords.next());
            }
        }
        do {
            String randomWord = words.get((int) (Math.random() * words.size()));
            guessAWord(randomWord);
            Scanner input = new Scanner(System.in);

            System.out.println("guess another word? Enter y or n > ");
            yesOrNo = Character.toLowerCase(input.nextLine().charAt(0));


        } while (yesOrNo == 'y');


    }

    private static void guessAWord(String randomWord) {

        Scanner input = new Scanner(System.in);
        int trueGuess = 0;
        int miss = 0;
        char[] asterix = new char[randomWord.length()];
        getTheAsterix(asterix, randomWord);
        do {
            System.out.print("guess a letter");
            char guess = input.nextLine().charAt(0);
            System.out.println(guess);
            if (!randomWord.contains(guess + "")) {
                System.out.println(guess + " is not in the word");
                miss++;
                continue;
            }
            if (isThereAlready(asterix, guess)) {
                System.out.println(guess + " is already in the word");
                continue;
            }

            for (int i = 0; i < randomWord.length(); i++) {
                if (guess == randomWord.charAt(i)) {
                    asterix[i] = guess;
                    trueGuess++;

                }
            }
        } while (trueGuess < randomWord.length());
        System.out.println("The word is " + randomWord);
        System.out.println("you missed " + miss + " times");
    }

    private static boolean isThereAlready(char[] asterix, char guess) {
        for (int i = 0; i < asterix.length; i++) {
            if (asterix[i] == guess) {
                return true;
            }
        }
        return false;
    }


    private static void getTheAsterix(char[] asterix, String randomWord) {
        for (int i = 0; i < randomWord.length(); i++) {
            asterix[i] = '*';
        }

    }


}



