package chapters.exercises3;
import java.util.*;

public class Exercise3_15 {
	public static void main(String[] args) {

         
        int lottery = (int)(Math.random() * 1000);

        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 3 digit number ");
        int guess = input.nextInt();

        
        int lotteryDigit1 = lottery / 100;
		int remainingDigits = lottery % 100;
		int lotteryDigit2 = remainingDigits / 10;
		int lotteryDigit3 = remainingDigits % 10;
        
		int guessDigit1 = guess / 100;
		int remainingDigits1 = guess % 100;
		int guessDigit2 = remainingDigits1 / 10;
		int guessDigit3 = remainingDigits1 % 10;
        

        System.out.println("The lottery numbers are: " + lottery);

        if (guess == lottery) {
            System.out.println("Exact Match");
        
        else if 
        (guessDigit2 == lotteryDigit1 
                && guessDigit1 == lotteryDigit2
                && guessDigit3 == lotteryDigit3)
            System.out.println("Matched all numbers");
        
        
        else if
        (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3
            || guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3)  
            System.out.println("Mathed one number");
        }
        else 
            System.out.println("No Match");

}
}

