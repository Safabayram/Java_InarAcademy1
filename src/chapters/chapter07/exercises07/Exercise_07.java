package chapters.chapter07.exercises07;

public class Exercise_07 {
    public static void main(String[] args) {
        int[] numbers = new int[10];


        for (int i = 1; i <= 100; i++) {
            numbers[(int)(Math.random() * 10)]++;
        }


        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "s: " + numbers[i]);
        }
    }

}
