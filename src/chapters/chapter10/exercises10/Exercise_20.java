package chapters.chapter10.exercises10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise_20 {
    public static void main(String[] args) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal sum = BigDecimal.ONE;

        for (int i = 1; i <= 1000; i++) {
            sum = sum.divide(new BigDecimal(i + ""), 25, RoundingMode.UP);
            e = e.add(sum);

            if (i % 100 == 0)
                System.out.println("The e is " + e + " for i = " + i);
        }


    }


}
