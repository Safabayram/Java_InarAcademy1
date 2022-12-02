package chapters.chapter_11.exercises11.Exercise_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<Integer>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            myList.add(input.nextInt());
        }

        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            myList.add(input.nextInt());
        }

        ArrayList<Integer> unionList = union(myList, myList1);

        System.out.print("The combined list is ");
        for (int i = 0; i < unionList.size(); i++)
            System.out.print(unionList.get(i) + " ");
    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            result.add(list2.get(i));
        }
        return result;


    }


}
