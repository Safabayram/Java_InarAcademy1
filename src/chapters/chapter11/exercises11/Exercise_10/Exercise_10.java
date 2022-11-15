package chapters.chapter11.exercises11.Exercise_10;

import chapters.chapter11.sampleQuestions.MyStack;

public class Exercise_10 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        for (int i = 10; i < 20; i++) {
            myStack.push(i);

        }
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }



}
