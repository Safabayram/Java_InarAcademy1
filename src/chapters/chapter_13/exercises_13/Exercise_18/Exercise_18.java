package chapters.chapter_13.exercises_13.Exercise_18;

import chapters.chapter_13.exercises_13.Exercise_15.RationalWithBigInteger;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        RationalWithBigInteger sum = new RationalWithBigInteger(BigInteger.ONE,new BigInteger("2"));

        for (BigInteger i = sum.getNumerator().add(BigInteger.ONE); i.compareTo(new BigInteger("100")) <= 0;i = i.add(BigInteger.ONE)) {
            sum = sum.add(new RationalWithBigInteger(i.subtract(BigInteger.ONE),i));

        }

        System.out.println("sum of the rationals is " + sum.doubleValue());
    }

}
