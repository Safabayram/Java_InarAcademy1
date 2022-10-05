package chapters.chapter06.exercise06;

public class Exercise6_18 {
    public static boolean isValidPassword(String s) {

        if (s.length() < 8)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) &&
                    !Character.isDigit(s.charAt(i)))
                return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                count++;
        }

        if (count >= 2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
