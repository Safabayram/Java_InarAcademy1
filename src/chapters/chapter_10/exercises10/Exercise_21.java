package chapters.chapter_10.exercises10;

import java.math.BigInteger;

public class Exercise_21 {
    public static void main(String[] args) {
        BigInteger max = new BigInteger(Long.MAX_VALUE + "");
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = BigInteger.ZERO;

        int count = 0;

        while (count < 10) {
            if (max.remainder(five).compareTo(zero) == 0 || max.remainder(six).compareTo(zero) == 0) {
                System.out.println(max);
                count++;


            }
            max = max.add(BigInteger.ONE);
        }


    }

}
