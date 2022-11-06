package chapters.chapter10.exercises10;

public class MyIntegerTest {
    public static void main(String[] args) {


        int[] values = {5, 10 ,65, 2, 47};


        System.out.println("Test if values are even using isEven:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
        }

        System.out.println("Test if values are odd using isOdd:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }

        System.out.println("Test if values are prime using isPrime:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }


        System.out.println("Test if values are even using isEven():");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven());
        }

        System.out.println("Test if values are odd using isOdd():");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd());
        }

        System.out.println("Test if values are prime using isPrime():");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }


        System.out.println("Test if values are even using isEven(MyInteger):");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }

        System.out.println("Test if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }

        System.out.println("Test if values are prime using isPrime(MyInteger):");
        for (int i = 0; i < values.length; i++) {

            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }


        int[] values2 = {8, 12, 7};
        MyInteger value = new MyInteger(8);
        System.out.println("Test if " + value.getValue() +
                " is equal to the specified value:");
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i] + " " + value.equals(values2[i]));
        }




        System.out.println("\nTest parseInt(char[]) and parseInt(String):");

        char[] numericCharacters = {'8', '1', '5'};


        String numericString = "232";
        System.out.print("\'");
        for (int i = 0; i < numericCharacters.length; i++) {
            System.out.print(numericCharacters[i] + "");
        }
        System.out.println("\' + \"" + numericString + "\" = " +
                (MyInteger.parseInt(numericCharacters) +
                        MyInteger.parseInt(numericString)));
    }

}


