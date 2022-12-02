package chapters.chapter_06.exercise06;

public class Exercise6_01 {
    public static void main(String[] args) {
        int n = 100;
        int line = 10;

        for (int i = 1; i < n; i++) {
            if (i % line == 0) {
                System.out.printf("%8d\n",getPentagonalNumber(i));
            } else {
                System.out.printf("%8d",getPentagonalNumber(i));
            }

        }


    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;

    }
}
