package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] eqn = new double[3];

        System.out.println("enter value for a , b  and c");
        for (int i = 0; i <eqn.length ; i++) {
            eqn[i] = input.nextDouble();

        }
        double []root = new double[2];
        int numberRealRoots = solveQuadratic(eqn,root);

        if (numberRealRoots == 0){
            System.out.println("there is no real roots");

        } else if (numberRealRoots == 1) {
            System.out.println("there is one real root ");

        }else {
            System.out.println("there are two real roots ");
        }

    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        if (discriminant < 0){
            return 0;
        } else if (discriminant == 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            return 1;

        }else {
            roots[0]= (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
            roots[1]= (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            return 2;

        }

    }
}
