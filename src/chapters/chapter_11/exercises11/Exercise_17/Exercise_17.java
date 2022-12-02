package chapters.chapter_11.exercises11.Exercise_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");

        int m = input.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        getFactors(m, factors);

        int smallestSquare = getSmallestSquare(factors);

        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));


    }

    public static int getSmallestSquare(ArrayList<Integer> factors) {
        int[][] occurArray = getCopyOfFactors(factors);
        for (int i : factors) {
            getOccur(occurArray, i);

        }
        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurArray);

        int smallestSquare = 1;
        for (int i = 0; i < oddSequenceFactors.size(); i++) {
            smallestSquare *= oddSequenceFactors.get(i);

        }
        return smallestSquare;



    }


    public static ArrayList<Integer> removeDuplicates(int[][] occurArray) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < occurArray.length; i++) {
            if (occurArray[i][1] % 2 != 0) {
                temp.add(occurArray[i][0]);
            }

        }

        ArrayList<Integer> duplicateRemoved = new ArrayList<>();

        for (int i = 0; i < temp.size(); i++) {
            if (!duplicateRemoved.contains(temp.get(i))) {
                duplicateRemoved.add(temp.get(i));
            }

        }
        return duplicateRemoved;

    }

    public static void getOccur(int[][] occurArray, int i) {
        for (int j = 0; j < occurArray.length; j++) {
            if (occurArray[j][0] == i) {
                occurArray[j][1]++;


            }

        }

    }

    public static int[][] getCopyOfFactors(ArrayList<Integer> factors) {
        int[][] temp = new int[factors.size()][2];

        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = factors.get(i);

        }
        return temp;
    }

    public static void getFactors(int m, ArrayList<Integer> factors) {
        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                factors.add(count);
                m /= count;
            } else {
                count++;
            }
        }
    }
}
