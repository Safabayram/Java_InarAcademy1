package chapters.chapter_12.exercises_12.Exercise_31;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        System.out.print("Enter the gender: ");
        String gender = input.next();


        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" + year
                    + ".txt");
            Scanner reader = new Scanner(url.openStream());

            while (reader.hasNext()) {
                String s = reader.nextLine();
                list = new ArrayList<>(Arrays.asList(s.split(" ")));
                if (gender.toUpperCase() == "M") {
                    if (list.get(1).equals(name)) {
                        System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                        System.exit(0);
                    }
                } else {
                    if (list.get(1).equals(name)) {
                        System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                        System.exit(1);
                    }

                }
                list.clear();
            }

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("The name " + name + " is not ranked in year " + year);


    }

}
