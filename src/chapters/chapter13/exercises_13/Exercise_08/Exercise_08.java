package chapters.chapter13.exercises_13.Exercise_08;

public class Exercise_08 {
    public static void main(String[] args) throws CloneNotSupportedException {


        MyStack myStack = new MyStack();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");

        MyStack myStack1 = (MyStack)myStack.clone();


        System.out.println(myStack.toString());

        System.out.println(myStack1.toString());



    }


}
