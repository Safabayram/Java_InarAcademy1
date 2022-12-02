package chapters.chapter_06.exercise06;

public class Exercise6_06 {
    public static void main(String[] args) {
        displayPattern(7);

    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = n -i; space >=1  ; space--) {
               System.out.print("    ");

            }
            for (int j = i; j >=1 ; j--) {
                System.out.printf("%4d",j);

            }

            System.out.println();

        }
    }
}
