package chapters.arrayList;

import java.util.ArrayList;

public class CountSingleDigits {
    public static void main(String[] args) {
        ArrayList<Integer> occurence = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            occurence.add(0);

        }


        for (int i = 0; i < 100; i++) {


            int number = (int) (Math.random() * 10);

            occurence.set(number, occurence.get(number) + 1);


        }

        for (int i = 0; i < occurence.size(); i++) {
            System.out.println(i + "s: " + occurence.get(i));


        }


    }
}
