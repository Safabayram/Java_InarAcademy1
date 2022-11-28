package chapters.chapter12.exercises_12.Exercise_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {

        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()){
                String[] line = (input.nextLine()).split(" ");
                String rank = line[2];
                String salary = line[3];
                if (rank.equals("assistant")){
                    assistant.add(Double.parseDouble(salary));
                } else if (rank.equals("associate")) {
                    associate.add(Double.parseDouble(salary));

                } else if (rank.equals("full")) {
                    full.add(Double.parseDouble(salary));

                }


            }
        }catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
            System.exit(0);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }

        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);


    }
    public static double getTotal(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }


}
