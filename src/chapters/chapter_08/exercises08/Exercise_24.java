package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        int[][] grid = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");
    }



    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (!is1To9(grid[i]))
                return false;
        }


        for (int j = 0; j < 9; j++) {

            int[] column = new int[9];
            for (int i = 0; i < 9; i++) {

                column[i] = grid[i][j];
            }

            if (!is1To9(column))
                return false;
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int k = 0;
                int[] list = new int[9];
                for (int row = i * 3; row < i * 3 + 3; row ++) {
                    for (int column = j * 3; column < j * 3 + 3; column++) {
                        list[k++] = grid[row][column];
                    }
                }
                if (!is1To9(list)) {
                    return false;
                }




            }
        }

        return true;
    }


    public static boolean is1To9(int[] list) {

        int[] temp = new int[list.length];
        System.arraycopy(list, 0, temp, 0, list.length);


        java.util.Arrays.sort(temp);


        for (int i = 0; i < 9; i++) {
            if (temp[i] != i + 1)
                return false;
        }

        return true;
    }
}


