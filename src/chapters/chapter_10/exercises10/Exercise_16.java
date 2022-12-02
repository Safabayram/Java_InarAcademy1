package chapters.chapter_10.exercises10;
import java.math.BigInteger;

public class Exercise_16 {
    public static void main(String[] args) {

        int count = 0;
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");

        while (count < 10){
            if (number.remainder(new BigInteger ("2")).equals(BigInteger.ZERO) ||
                    number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }


}
