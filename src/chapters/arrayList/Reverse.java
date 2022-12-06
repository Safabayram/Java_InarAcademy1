package chapters.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println(" Enter ten numbers ");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextDouble());
        }

        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.println(numbers.get(i) + " ");

        }





    }
}
