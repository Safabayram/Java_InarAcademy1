package week_15.Calculator;

public class Calculator {
    public static Number sum(Number n1, Number n2) {
        Number result;
        result = new Number(n1.getValue() + n2.getValue());
        return result;


    }

    public static Number divide(Number n1, Number n2) {
        Number result;
        result = new Number(n1.getValue() / n2.getValue());
        return result;


    }

    public static Number multiply(Number n1, Number n2) {
        Number result;
        result = new Number(n1.getValue() * n2.getValue());
        return result;


    }

    public static Number subtract(Number n1, Number n2) {
        Number result;
        result = new Number(n1.getValue() - n2.getValue());
        return result;


    }

    public static Number mod(Number n1, Number n2) {
        Number result;
        result = new Number(n1.getValue() % n2.getValue());
        return result;


    }


    public static void reset(Number n1, Number n2) {
        n1 = null;
        n2 = null;

    }

    public static void reset(Number n1) {
        n1 = null;
    }

    public static void changeSign(Number n1) {
        n1.setValue(n1.getValue() * -1);
    }


}
