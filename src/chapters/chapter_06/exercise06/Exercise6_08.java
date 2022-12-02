package chapters.chapter_06.exercise06;

public class Exercise6_08 {
    public static void main(String[] args) {
        System.out.println("Celsius       Fahrenheit      | Fahrenheit        Celsius");
        System.out.println("---------------------------------------------------------");
        double celsius = 40;
        double fahrenheit = 120;
        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
            System.out.printf("%-15.1f%-15.1f%5s%-15.1f%-15.2f\n", celsius, celsiusToFahrenheit(celsius), "|    ", fahrenheit,
                    fahrenheitToCelsius(fahrenheit));
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit  - 32);
        return celsius;
    }

}
