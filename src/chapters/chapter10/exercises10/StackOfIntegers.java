package chapters.chapter10.exercises10;

public class StackOfIntegers {

    private int[] elements;
    private int size;


    public StackOfIntegers() {
        this(16);
    }


    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }


    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }


}
