package chapters.chapter_06.exercise06;

public class Exercise6_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(getRandomCharacter('A', 'Z'));
            else
                System.out.print(getRandomCharacter('a', 'z'));
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(getRandomCharacter('0', '9'));
            else
                System.out.print(getRandomCharacter('0', '9'));
        }
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

}
