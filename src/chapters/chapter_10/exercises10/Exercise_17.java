package chapters.chapter_10.exercises10;

import java.math.BigDecimal;

public class Exercise_17 {
    public static void main(String[] args) {

        BigDecimal MaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal initialValue = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squaredValue = initialValue.multiply(initialValue);
            if (squaredValue.compareTo(MaxValue) > 0) {
                count++;
                System.out.println(count +": " + initialValue + " squared = " + squaredValue);
            }
            initialValue = initialValue.add(BigDecimal.ONE);
        }
    }

}
