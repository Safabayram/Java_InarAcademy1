package week_17;

import java.util.*;

public class Example {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        addRandomValue(list, 15);

        System.out.println(Arrays.toString(list.toArray()));

        printUniqueValues(list);


    }

    public static void addRandomValue(List list, int size) {
        for (int i = 0; i < size; i++) {
            int number = (int) (Math.random() * 100);
            list.add(number);

        }
    }

    private static void printUniqueValues(List<Integer> list) {
        Set<Integer> mySet = new HashSet<>();
        mySet.addAll(list);

        System.out.println(Arrays.toString(mySet.toArray()));


    }
}

