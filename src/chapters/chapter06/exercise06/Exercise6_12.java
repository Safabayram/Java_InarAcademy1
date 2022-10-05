package chapters.chapter06.exercise06;

public class Exercise6_12 {
    public static void printChars(char ch1, char ch2, int
            numberPerLine) {
        int firstCharacter = (int) ch1;
        int secondCharacter = (int) ch2;
        int count = 0;
        for (int i = firstCharacter; i <= secondCharacter; i++) {
            System.out.print(((char) i) + " ");
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
}
