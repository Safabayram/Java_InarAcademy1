package chapters.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EliminateDublicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter ten numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        Set<Integer> eliminatedSet = eliminateDuplicates(array);
        System.out.println(eliminatedSet.toString());


    }

    public static Set<Integer> eliminateDuplicates(int[] list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        return set;


    }

}
