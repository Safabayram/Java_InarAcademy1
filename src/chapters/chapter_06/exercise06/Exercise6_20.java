package chapters.chapter_06.exercise06;

public class Exercise6_20 {
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The number of letters is " + countLetters(s));
    }
}
