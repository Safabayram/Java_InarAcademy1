package chapters.chapter08.exercises08;

public class Exercise_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        for (int i = 0; i < m.length; i++) {
            System.out.printf("{%1d, %1d}  ", m[i][0], m[i][1]);
        }
        System.out.println();





    }
    public static void shuffle(int[][] m){
        for (int i = 0; i <m.length ; i++) {
            int index = (int)(Math.random() * m.length);
            int[] temp = m[i];
            m[i] = m[index];
            m[index] =temp;

        }

    }
}
