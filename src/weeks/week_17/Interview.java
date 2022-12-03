package week_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Interview {
    public static void main(String[] args) {


    }

    private static void searchWord(String resume, Set<String> jd) {

        Map<String, Integer> map = new HashMap<>();

        String[] arr = resume.toLowerCase().split("\\s");
        for (String word : arr
        ) {
            if (jd.contains(word)) {
                if (map.containsKey(word)) {
                    int number = map.get(word);
                    map.put(word, number + 1);

                } else {
                    map.put(word, 1);
                }

            }


        }


    }
}
