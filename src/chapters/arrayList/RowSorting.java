package chapters.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RowSorting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<List<Double>> matrix = new ArrayList<>();

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                (matrix.get(i)).add(input.nextDouble());

            }

        }

        for (int i = 0; i <matrix.size(); i++) {
            Collections.sort(matrix.get(i));

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println(matrix.get(i).get(j) + " ");

            }
            System.out.println();

        }











    }

}
