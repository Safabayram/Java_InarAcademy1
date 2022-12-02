package chapters.chapter_06.exercise06;

public class Exercise6_13 {
    public static double compute(int a) {
        double result = 0 ;
        for (double i = 1 ; i <= a ; i++) {
            result += i / (i + 1) ;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("i               m(i)     ");
        System.out.println("-------------------------");
        for (int i = 1; i <=20 ; i++) {
            System.out.printf("%-2d%14s%-9.4f" , i , " " , compute(i));
            System.out.println();

        }
    }
}
