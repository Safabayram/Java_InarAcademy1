package chapters.chapter_13.exercises_13.Exercise_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_02 {
    public static void main(String[] args) {
        Number [] numbers = {1,2,3,4,5,6,7,8,9};

        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));

        shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");


        }

    }
    public static void shuffle(ArrayList<Number> list) {
        //Collections.shuffle(list);
        for (int i = 0; i <list.size() ; i++) {
            int index = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index,temp);
        }

        }
    }

