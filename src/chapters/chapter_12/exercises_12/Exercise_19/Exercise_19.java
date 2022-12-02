package chapters.chapter_12.exercises_12.Exercise_19;

import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        try {
            java.net.URL myUrl = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

            int count = 0;
            Scanner input = new Scanner(myUrl.openStream());
            while (input.hasNext()) {
                if (Character.isLetter(input.next().charAt(0))) {
                    count++;

                }
            }
            System.out.println("number of words in adress :" + count);
        } catch (java.net.MalformedURLException ex) {
            System.out.println(ex.getMessage());

        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}
