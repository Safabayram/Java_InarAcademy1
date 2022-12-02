package chapters.chapter_13.exercises_13.Exercise_16;

import chapters.chapter_13.exercises_13.Exercise_14.Rational;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise13_16 \"operand1 operator operand2\"");
            System.exit(0);
        }
        Rational result = new Rational(0, 1);

        String[] operands = args[0].split(" ");

        switch (operands[1].charAt(0)) {
            case '+':
                result = getRational(operands[0]).add(getRational(operands[2]));
                break;
            case '-':
                result = getRational(operands[0]).subtract(getRational(operands[2]));
                break;
            case '*':
                result = getRational(operands[0]).multiply(getRational(operands[2]));
                break;
            case '/':
                result = getRational(operands[0]).divide(getRational(operands[2]));
                break;
        }

        System.out.println(operands[0] + " " + operands[1] + " " + operands[2] + " = " + result);


    }

    private static Rational getRational(String operand) {
        String[] s = operand.split("/");
        int numerator = Integer.parseInt(s[0]);
        int denominator = Integer.parseInt(s[1]);
        return new Rational(numerator, denominator);

    }
}
