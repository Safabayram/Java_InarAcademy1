package week_15.Calculator;


public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public Number() {
        this(0);
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
