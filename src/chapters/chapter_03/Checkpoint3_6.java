package chapters.chapter_03;

public class Checkpoint3_6 {
	public static void main(String[] args) {
		double score = 86 ;
		
		if (score > 90)	{
			score = score + (score / 100 * 3);
			}
		else {
			score = score + (score /100 * 1);
		}
		System.out.println(score);
		
	}

}
