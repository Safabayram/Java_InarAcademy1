package chapters.chapter06.exercise06;

public class Exercise6_09 {
    public static void main(String[] args) {
        System.out.println("Feet          Meters          |   Meters            Feet");
        System.out.println("--------------------------------------------------------");
        double meter = 20.0;
        double foot = 1.0;
        for (int i = 1; i <= 10; meter += 5, foot++, i++) {
            System.out.printf("%-15.1f%-15.1f%5s%-15.1f%-15.2f\n", foot, footToMeter(foot),"|     " ,meter, meterToFoot(meter));

        }

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;

    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;

    }
}
