package chapters.chapter_10.exercises10;

public class Queue {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int newElement) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = newElement;
    }

    public int dequeue() {
        int outElement = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        size--;
        return outElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }








}
