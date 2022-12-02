package chapters.chapter_10.exercises10;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        number = number.add(BigInteger.ONE);
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
    public static boolean isPrime(BigInteger number) {
        for (BigInteger d = new BigInteger("2");
             d.compareTo(number.divide(new BigInteger("2"))) <= 0;
             d = d.add(new BigInteger("1"))) {
            if (number.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }


}

