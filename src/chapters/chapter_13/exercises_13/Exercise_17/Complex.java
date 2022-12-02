package chapters.chapter_13.exercises_13.Exercise_17;

public class Complex implements Cloneable {
    private double a;
    private double b;


    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }


    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }
    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex secondComplex) {
        return new Complex(a + secondComplex.a,
                b + secondComplex.b);
    }
    public Complex subtract(Complex secondComplex) {
        return new Complex(a - secondComplex.a,
                b - secondComplex.b);
    }
    public Complex divide(Complex secondComplex) {
        return new Complex((a * secondComplex.a + b * secondComplex.b) /
                (Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)),
                (b * secondComplex.a - a * secondComplex.b) /
                        (Math.pow(secondComplex.a, 2) +  Math.pow(secondComplex.b, 2)));
    }
    public Complex multiply(Complex secondComplex) {
        return new Complex((a * secondComplex.a + b * secondComplex.b) *
                (Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)),
                (b * secondComplex.a - a * secondComplex.b) *
                        (Math.pow(secondComplex.a, 2) +  Math.pow(secondComplex.b, 2)));
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public Complex clone() throws CloneNotSupportedException {
        return (Complex)super.clone();
    }

    public String toString() {
        return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
    }









}
