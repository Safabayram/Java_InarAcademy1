package chapters.chapter_12.exercises_12.Exercise_04;

public class Exercise_04 {
    public static void main(String[] args) {
        try {
            LoanWithException myLoan = new LoanWithException(-3,45,50000);

        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("system is running");
    }


}
