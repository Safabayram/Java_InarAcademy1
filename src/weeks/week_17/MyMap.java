package week_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(10, 12);
        map.put(1, 23);
        map.put(2, 78);

        print(map);
    }

    private static void print(Map<Integer, Integer> map) {
        Set<Integer> set = map.keySet();
        for (Integer key : set
        ) {
            System.out.println(map.get(key));

        }


    }
    private static void exampleMap(){
        Map<String,String> inarMap = new HashMap<>();
        inarMap.put("establishment","2020");
        inarMap.put("course","java");
        inarMap.put("teacher","tarik");

    }

}
