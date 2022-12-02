package chapters.chapter_06.exercise06;

public class Exercise6_14 {
    public static double estimatePI(int a) {
        double pi = 0;
        for (double i = 1; i <= a; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }

    public static void main(String[] args) {


        int finish = 901;
        System.out.println("\ni           m(i)     ");
        System.out.println("---------------------");
        for (int i = 1; i <= finish; i += 100) {
            System.out.printf("%-3d%12s%-8.4f" , i , " " , estimatePI(i) );
            System.out.println();
        }
    }


}
