package chapters.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CombineTwoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }
        ArrayList<Integer> union = union(list1, list2);
        System.out.println("The combined list is : ");
        int size = union.size();
        for (int i = 0; i < size; i++) {
            System.out.print(union.get(i) + " ");
        }
    }

    private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> uniSet = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            uniSet.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            uniSet.add(list2.get(i));
        }
        return new ArrayList<>(uniSet);
    }

}

