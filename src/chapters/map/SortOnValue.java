package chapters.map;

import java.util.*;

public class SortOnValue {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        System.out.println(map.toString());

        List<Map.Entry<Integer,Integer>> sorted = new ArrayList<>(map.entrySet());
        sorted.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        sorted.forEach(System.out::println);




























    }

}
