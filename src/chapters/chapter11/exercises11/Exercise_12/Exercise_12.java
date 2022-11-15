package chapters.chapter11.exercises11.Exercise_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> myList = new ArrayList<Double>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            myList.add(input.nextDouble());
        }
        System.out.println("sum of list is " + sum(myList));





    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;

    }

}
