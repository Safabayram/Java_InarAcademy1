package chapters.chapter_13.exercises_13.Exercise_19;

import chapters.chapter_13.exercises_13.Exercise_15.RationalWithBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a decimal number ");

        String [] decimal = input.nextLine().split(",");

        RationalWithBigInteger integer = new RationalWithBigInteger(new BigInteger(decimal[0]),BigInteger.ONE);

        BigInteger fractionalN = new BigInteger(decimal[1]);
        BigInteger fractionalD = new BigInteger(String.valueOf((int)Math.pow(10,decimal[1].length())));

        RationalWithBigInteger fractional = new RationalWithBigInteger(fractionalN,fractionalD);

        System.out.println("The fraction number is " +
                (decimal[0].charAt(0) == '-' ? (integer).subtract(fractional) : (integer).add(fractional)));






    }
}
