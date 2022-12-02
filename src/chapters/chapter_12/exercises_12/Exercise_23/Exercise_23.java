package chapters.chapter_12.exercises_12.Exercise_23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();


        try {
            java.net.URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                list.add(input.nextDouble());
            }

            double sum = 0;

            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);


            }

            System.out.println("sum  is " + sum + " average is " + (sum / list.size()));

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}
