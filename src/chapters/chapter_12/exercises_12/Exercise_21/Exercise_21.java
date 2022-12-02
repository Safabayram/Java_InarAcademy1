package chapters.chapter_12.exercises_12.Exercise_21;

import java.io.File;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws Exception {
        File file = new File("SortedStrings.txt");

        boolean isSorted = true;

        try (
                Scanner input = new Scanner(file);

        ) {
            String str = input.next();
            while (input.hasNext()) {
                String str2 = input.next();
                if (str.compareTo(str2) > 0) {
                    isSorted = false;
                    System.out.println("Strings arent sorted!! ");
                    System.out.println(str + " " + str2);
                }
                str = str2;
            }
        }
        if (isSorted) {
            System.out.println("strings are sorted ");
        }


    }

}
