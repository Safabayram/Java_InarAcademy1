package chapters.chapter_10.exercises10;

public class Ecercise_26 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.exit(1);
        }
        args[0] = args[0].trim();
        args[2] = args[2].trim();

        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
            case '*':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

}
