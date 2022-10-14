package chapters.chapter07.exercises07;

public class Exercise_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int[] primeNumbers = new int[NUMBER_OF_PRIMES];


        int count = 0;
        int number = 2;
        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(number, count, primeNumbers)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        displayPrimes(primeNumbers, 10);

    }

    public static void displayPrimes(int[] primes, int a) {
        for (int i = 0; i < primes.length; i++) {

            if (i % a == 0) {
                System.out.println();
            }
            System.out.printf("%4d " ,primes[i]);
        }
    }


    public static boolean isPrime(int number, int count, int[] primes) {
        for (int i = 0; primes[i] <= Math.sqrt(number) && i < count; i++) {
            if (number % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }
    }

        
