package chapters.map;

import java.util.*;

public class CountTheOccurence {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter a number of integers."
                + "\nInput ends when the input is 0:");


        int key;
        while ((key = input.nextInt()) != 0) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            }
            else {
                int occurence = map.get(key);
                occurence++;
                map.put(key, occurence);
            }
        }

        int max = Collections.max(map.values());

        System.out.print("The most occurrences integers are: ");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();









    }

}
