package chapters.chapter_12.exercises_12.Exercise_01;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(1);


        }

        controlOperands(args[0]);
        controlOperands(args[2]);
        int result = 0;


        switch (args[1].charAt(0)) {
            case '+' : result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' : result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '.' : result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }


        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }





    public static void controlOperands(String arg) {
        if (!Character.isDigit(arg.charAt(0)));{
            System.out.println("wrong input : + " + arg);
            System.exit(0);
        }

    }
}
