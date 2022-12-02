package chapters.chapter_06.exercise06;

public class Exercise6_30 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        int result = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + result );

        if (result == 7 && result == 11 ){
            System.out.println("You win!!");
        } else if (result == 2 && result == 12 && result == 3) {
            System.out.println("You lose!!");
            
        }else {
            System.out.println("point is " + result);
            pointCase(result);
        }

    }

    public static void pointCase(int point) {
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        int result = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + result );

        while(result != 7 && result != point){
             num1 = (int)(Math.random() * 6) + 1;
             num2 = (int)(Math.random() * 6) + 1;
             result = num1 + num2;
            System.out.println("You rolled " + num1 + " + " + num2 + " = " + result );




        }
        if(result == 7){
            System.out.println("you lose ");
        }else {
            System.out.println("you win");
        }
    }
}
