package chapters.chapter12.exercises_12.Exercise_13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        int numberOfChar = 0;
        int numberOfWords = 0;
        int numberOflines = 0;

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                numberOflines++;
                String line = input.nextLine();
                numberOfChar += line.length();

            }

        }
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = input.next();
                numberOfWords++;
            }
        }

        System.out.println(file.getName());
        System.out.println(numberOfChar);
        System.out.println(numberOfWords);
        System.out.println(numberOflines);


    }

}
