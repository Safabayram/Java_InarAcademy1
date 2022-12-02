package chapters.chapter_06.exercise06;

public class Exercise6_28 {
    public static void main(String[] args) {
        System.out.println("p             2^p-1");
        System.out.println("-------------------");
        for (int i = 2; i <= 31; i++) {
            if(isPrime(i)){
                int result = ((int) Math.pow(2,i)) - 1 ;
                System.out.printf("%-2d%12s%-5d" , i , " " , result);
                System.out.println();
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
