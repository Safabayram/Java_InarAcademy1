package chapters.chapter10.exercises10;

public class BMITest {
    public static void main(String[] args) {
        BMI safa = new BMI("safa",26,85,190);
        System.out.println("The BMI for " + safa.getName() + " is "
                + safa.getBMI() + " " + safa.getStatus());


    }
}
