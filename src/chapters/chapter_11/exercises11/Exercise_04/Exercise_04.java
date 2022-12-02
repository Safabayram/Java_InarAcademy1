package chapters.chapter_11.exercises11.Exercise_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<Integer>();

        System.out.print("Enter integers (input ends with 0): ");
        int number;

        do {
            number = input.nextInt();

            if (number != 0) {
                myList.add(number);
            }
        } while (number != 0);

        System.out.println("max number is " + getMax(myList));


    }

    public static Integer getMax(ArrayList<Integer> myList) {
        if (myList == null || myList.size() == 0) {
            return null;
        }
        int max = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
            }

        }
        return max;

    }


}
