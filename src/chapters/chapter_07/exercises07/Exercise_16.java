package chapters.chapter_07.exercises07;

public class Exercise_16 {
    public static void main(String[] args) {
        final int CONSTANT = 100_000;
        int[] list = new int[CONSTANT];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * CONSTANT);
        }
        int key = (int)(Math.random() *CONSTANT);
        long startTime = System.currentTimeMillis();
        int i = linearSearch(list,key );
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("The execution time of invoking the LinearSearch is " + executionTime);
        startTime = System.currentTimeMillis();
        java.util.Arrays.sort(list);
        i = binarySearch(list, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The execution time of invoking the BinarySearch is " + executionTime);

    }
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -1;
    }





}
