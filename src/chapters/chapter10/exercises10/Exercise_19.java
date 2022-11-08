package chapters.chapter10.exercises10;

import java.math.BigInteger;

public class Exercise_19 {
    public static void main(String[] args) {
        System.out.println("p       2^p - 1");

        for (BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("100")) <=0 ; a = a.add(new BigInteger("1"))) {
            if (isPrime(a)){
                System.out.printf("%-3d", a);
                System.out.println("       " + getMersennePrime(a));
            }

        }

    }
    public static BigInteger getMersennePrime(BigInteger number) {
        BigInteger pow = new BigInteger("2");
        BigInteger mersenne = new BigInteger("2");
        for (BigInteger i = new BigInteger("1"); i.compareTo(number) < 0;
             i = i.add(new BigInteger("1"))) {
            mersenne = mersenne.multiply(pow);
        }
        return mersenne.subtract(new BigInteger("1"));
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
