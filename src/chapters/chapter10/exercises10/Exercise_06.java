package chapters.chapter10.exercises10;

public class Exercise_06 {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();


        for (int i = 2; i < 120; i++) {
            if (isPrime(i))
                stack.push(i);
        }


        System.out.println(
                "\nAll the prime numbers less than 120 in decreasing order:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }


    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
