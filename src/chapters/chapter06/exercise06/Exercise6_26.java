package chapters.chapter06.exercise06;

public class Exercise6_26 {
    public static void main(String[] args) {
        int count = 1 ;
        int number = 2 ;
        while (count < 101) {
            if(isPrime(number) && isPalindrome(number)){
                System.out.printf("%5d " ,number);
                if(count % 10 == 0){
                    System.out.println();
                }
                count++;
            }
            number++;
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
    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int reverse(int number) {
        String s = number + "" ;
        String result = "" ;
        for (int i = s.length() - 1 ; i >= 0 ; i-- ){
            result += s.charAt(i) ;
        }
        return Integer.parseInt(result);
    }
}
