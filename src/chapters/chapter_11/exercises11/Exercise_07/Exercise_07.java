package chapters.chapter_11.exercises11.Exercise_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_07 {
    public static void main(String[] args) {

        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(myArray));

        shuffle(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");

        }


    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);


    }


}

