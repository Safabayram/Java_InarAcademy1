package chapters.chapter10.exercises10;

import java.util.Scanner;

public class StackOfIntegersTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        System.out.print("The smallest factors of " + num + " are: ");
        StackOfIntegers stack = new StackOfIntegers();
        getSmallestFactors(num,stack);



        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");

        }

    }
    public static void getSmallestFactors(int num, StackOfIntegers stack){

        int factor = 2;
        while (num / factor != 1) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        stack.push(num);

    }

}
