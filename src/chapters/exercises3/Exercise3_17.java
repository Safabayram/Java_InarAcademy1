package chapters.exercises3;
import java.util.*;

public class Exercise3_17 {
	public static void main(String[] args) {
		
		int program = (int)(Math.random() * 3);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		
		int user = input.nextInt();
		
		System.out.print("The program is ");
		switch (program)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
			
		}
		
		boolean win = (user == 0 && program == 2) ||
				  (user == 1 && program == 0) || 
				  (user == 2 && program == 1);
		
		if (program == user) {
			System.out.println("ıt is a draw.");
		}
		else if (win) {
		System.out.println("you won");
		}
		else 
			System.out.println("you lost");
	}
}
			
		
		
		
	
		
			

	

