package week_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(45);
        set.add(12);

        System.out.println(set.size());
        print(set);
    }

    private static void print(Set<Integer> set) {
        System.out.println(Arrays.toString(set.toArray()));
    }

    private static void addRandomValue(Set set, int i) {
        for (int j = 0; j < i; j++) {
            int number = (int) Math.random() * 100;
            set.add(number);
            System.out.println(number + "is added");


        }
    }


}
