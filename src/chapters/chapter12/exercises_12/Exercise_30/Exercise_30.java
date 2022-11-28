package chapters.chapter12.exercises_12.Exercise_30;

import java.io.File;
import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = input.nextLine();
        File file = new File(name);

        final int ALPHABET = 26;

        int[] counter = new int[ALPHABET];

        try (
                Scanner reader = new Scanner(file)
        ) {
            while (reader.hasNext()) {
                String s = reader.nextLine();

                for (int i = 0; i < s.length(); i++) {
                    if ((Character.isLetter(s.charAt(i)))) {
                        counter[Character.toUpperCase(s.charAt(i)) - 'A']++;
                    }

                }
            }
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println("The occurrence of " + (char) (i + 'A') + "'s is "
                    + counter[i]);
        }


    }

}
