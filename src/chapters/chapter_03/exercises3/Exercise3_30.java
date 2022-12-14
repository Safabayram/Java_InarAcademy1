package chapters.chapter_03.exercises3;
import java.util.*;

public class Exercise3_30 {
	public static void main(String[] args) {
	    
	    
		Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter the time zone offset to GMT: ");
	    
		long timeZoneOffset = input.nextLong();
	    
	    
	    long totalMilliseconds = System.currentTimeMillis();

	    
	    long totalSeconds = totalMilliseconds / 1000;

	    
	    long currentSecond = totalSeconds % 60;

	    
	    long totalMinutes = totalSeconds / 60;

	    
	    long currentMinute = totalMinutes % 60;

	    
	    long totalHours = totalMinutes / 60;

	    
	    long currentHour = (totalHours + timeZoneOffset) % 24;

	    
	    System.out.print("Current time is " + (currentHour % 12) + ":"
	      + currentMinute + ":" + currentSecond);
	    
	    if (currentHour < 12)
	      System.out.println(" AM");
	    
	    else
	      System.out.println(" PM");    	
	}
}


