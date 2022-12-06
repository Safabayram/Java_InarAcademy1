package chapters.set;

import java.util.HashSet;
import java.util.Set;

public class FindPrimes {
    public static void main(String[] args) {
        Set<Integer> primes = new HashSet<>();


        int number = 2;
        while (primes.size() < 50){
            if (isPrime(number, primes)){
                primes.add(number);

            }
            number++;
        }


    }

    private static boolean isPrime(int number, Set<Integer> primes) {
        for (int i: primes
             ) {
            if (i <= Math.sqrt(number) && number % i ==0){
                return false;
            }

        }
        return true;



    }
}
