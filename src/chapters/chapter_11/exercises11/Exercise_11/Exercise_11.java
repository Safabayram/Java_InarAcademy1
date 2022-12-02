package chapters.chapter_11.exercises11.Exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<Integer>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            myList.add(input.nextInt());
        }

        sort(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }


    }

    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);

    }


}
