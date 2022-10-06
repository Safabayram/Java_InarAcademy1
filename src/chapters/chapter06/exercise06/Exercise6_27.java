package chapters.chapter06.exercise06;

public class Exercise6_27 {
    public static void main(String[] args) {
        int count = 1 ;
        int number = 10;
        while (count < 101){
            if(isPrime(number)&&isPrimeReverseNotPalindrome(number)){
                System.out.print(number + " ");
                if(count % 10 == 0){
                    System.out.println();
                }
                count++;




            }
            number++;
        }

    }



    public static boolean isPrimeReverseNotPalindrome(int number) {
        String s = number + "";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            reverse += s.charAt(i);


        }
        int reversem = Integer.parseInt(reverse);


        return isPrime(reversem) && !(number == reversem);

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
    }

