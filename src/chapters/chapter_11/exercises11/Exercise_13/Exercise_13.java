package chapters.chapter_11.exercises11.Exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<Integer>();

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            myList.add(input.nextInt());
        }

        removeDuplicate(myList);

        System.out.println("The distinct integers are ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");

        }


    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));


                }

            }


        }


    }

}
