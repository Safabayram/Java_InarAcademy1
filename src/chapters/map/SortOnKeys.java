package chapters.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortOnKeys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        System.out.println(map.toString());

        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());

        Collections.sort(sortedKeys);

        for (Integer i:sortedKeys
             ) {
            System.out.println("key = " + i + "value = " + map.get(i));

        }


    }
}
