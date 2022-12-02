package chapters.chapter_06.exercise06;

public class Exercise6_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount           Commission");
        System.out.println("---------------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-12d%11s%10.1f", i, " ", computeCommission(i));
            System.out.println();

        }
    }

    public static double computeCommission(int salesAmount) {
        return (5000 * 0.08) + (5000 * 0.10) + ((salesAmount - 10000) * 0.12);
    }
}

