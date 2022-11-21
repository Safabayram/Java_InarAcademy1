package week_15.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter two number");
        Number n1 = new Number(input.nextDouble());
        Number n2 = new Number(input.nextDouble());

        System.out.println("enter the calculation");

        String cal = input.next();

        switch (cal){
            case "sum":
                print(Calculator.sum(n1,n2));
                break;
            case("sub"):
               print( Calculator.subtract(n1,n2));
                break;
            case ("x"):
                print( Calculator.subtract(n1,n2));
                break;
            case ("mod"):
                print(Calculator.mod(n1,n2));
                break;

        }
    }
    public static void print(Number result){
        System.out.println(result.getValue());
    }

}
