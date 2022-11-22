package chapters.chapter12.exercises_12.Exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        try {
            int [] array = new int[2000000000];

        }catch (OutOfMemoryError er){
            System.out.println(er.getMessage());
        }

        System.out.println("system is running...");
    }

}
