package chapters.chapters03.exercises3;

public class Exercise3_24 {
	public static void main(String[] args) {

		int number = (int)((Math.random() * (14 - 1)) + 1);

		
		int suit = (int)(Math.random() * 4);

		
		System.out.print("The card you picked is ");
		switch(number)
		{
			case 1: System.out.print("Ace"); break;
			case 2: System.out.print(number); break;
			case 3: System.out.print(number); break;
			case 4: System.out.print(number); break;
			case 5: System.out.print(number); break;
			case 6: System.out.print(number); break;
			case 7: System.out.print(number); break;
			case 8: System.out.print(number); break;
			case 9: System.out.print(number); break;
			case 10: System.out.print(number); break;
			case 11: System.out.print("Jack"); break;
			case 12: System.out.print("Queen"); break;
			case 13: System.out.print("King"); 
		}
		
		System.out.print(" of ");
		switch (suit)
		{
			case 0: System.out.println("Clubs"); break;
			case 1: System.out.println("Diamonds"); break;
			case 2: System.out.println("Hearts"); break;
			case 3: System.out.println("Spades"); 
		}
	}

}