package week_17;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(8);
        print(list);

        list.set(2,91);

        print(list);


    }
    private static void print(List list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static Integer min(List list){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() ; i++) {
            if (min > (int) list.get(i)){
                min = (int)list.get(i);

            }

        }
        return min;
    }
    public static int indexOfSmallestElement(List list){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < list.size() ; i++) {
            if (min >(int)list.get(i)){
                min = (int)list.get(i);
                minIndex = i;

            }

        }
        return minIndex;
    }
}
