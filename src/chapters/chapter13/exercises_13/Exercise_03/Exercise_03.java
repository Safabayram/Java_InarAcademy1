package chapters.chapter13.exercises_13.Exercise_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise_03 {
    public static void main(String[] args) {
        Number[] numbers = {6, 4, 8, 7, 2, 3, 1, 4};

        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));

        sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }


    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min.intValue() > list.get(j).intValue()) {
                    min = list.get(j);
                    index = j;
                }

            }
            if (index != i) {
                list.set(index, list.get(i));
                list.set(i, min);
            }


        }
    }
}
