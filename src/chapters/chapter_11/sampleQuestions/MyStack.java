package chapters.chapter_11.sampleQuestions;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public static final int DEFAULT_CAPACITY = 16;

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public MyStack(int capacity) {
        super(capacity);
    }


    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return super.get(getSize() - 1);
    }

    public Object pop() {
        Object o = super.get(getSize() - 1);
        super.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        super.add(o);
    }

    public String toString() {
        return super.toString();
    }


}
