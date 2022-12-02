package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] matrix = getMatrix();
        int row = oddRow1s(matrix);
        int column = oddColumn1s(matrix);

        if (row < 0 || column < 0)
            System.out.println("No cell has been flipped");
        else {
            System.out.println(
                    "The flipped cell is at (" + row + ", " + column + ")");
        }
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[6][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    public static int oddRow1s(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count % 2 != 0)
                return i;
        }
        return -1;
    }

    public static int oddColumn1s(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] == 1)
                    count++;
            }
            if (count % 2 != 0)
                return i;
        }
        return -1;
    }
}






