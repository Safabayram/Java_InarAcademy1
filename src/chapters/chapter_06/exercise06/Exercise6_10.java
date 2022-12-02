package chapters.chapter_06.exercise06;

public class Exercise6_10 {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10000 : ");
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        for (int i = 2; i < 10000 ; i++) {
            if(isPrime(i)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", i);
                }
                else {
                    System.out.printf("%-5s", i);
                }
            }

        }

    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }


}

