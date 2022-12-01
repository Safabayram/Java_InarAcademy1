package chapters.chapter13.exercises_13.Exercise_15;

import chapters.chapter13.exercises_13.Exercise_14.Rational;

import java.math.BigInteger;

public class RationalWithBigInteger extends Number implements Comparable<RationalWithBigInteger> {


    private BigInteger[] r = new BigInteger[2];

    public RationalWithBigInteger() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public RationalWithBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.r[0] = numerator.divide(gcd);
        this.r[1] = denominator.divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n;
        BigInteger n2 = d;
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n1) <= 0 && i.compareTo(n2) <= 0;
             i = i.add(BigInteger.ONE)) {
            if (n1.remainder(i).compareTo(BigInteger.ZERO) == 0 &&
                    n2.remainder(i).compareTo(BigInteger.ZERO) == 0)
                gcd = i;
        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDenominator() {
        return r[1];
    }

    public RationalWithBigInteger add(RationalWithBigInteger secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getNumerator())).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());

        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger subtract(RationalWithBigInteger secondRational) {
        BigInteger n = (r[0].multiply(secondRational.getDenominator())).subtract(
                r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger multiply(RationalWithBigInteger secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new RationalWithBigInteger(n, d);
    }

    public RationalWithBigInteger divide(RationalWithBigInteger secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new RationalWithBigInteger(n, d);
    }

    public String toString() {
        if (r[1].compareTo(BigInteger.ONE) == 0)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    public boolean equals(Object other) {
        if (((this.subtract((RationalWithBigInteger) (other))).getNumerator()).compareTo(BigInteger.ZERO) == 0)
            return true;
        else
            return false;
    }

    public int intValue() {
        return (int) doubleValue();
    }

    public float floatValue() {
        return (float) doubleValue();
    }


    public double doubleValue() {
        return this.getNumerator().doubleValue() /
                this.getDenominator().doubleValue();
    }


    public long longValue() {
        return (long) doubleValue();
    }

    public int compareTo(RationalWithBigInteger a) {
        BigInteger n = this.subtract((RationalWithBigInteger) a).getNumerator();
        if (n.compareTo(BigInteger.ZERO) > 0) {
            return 1;
        } else if (n.compareTo(BigInteger.ZERO) < 0) {
            return -1;

        } else {
            return 0;
        }

    }


}
