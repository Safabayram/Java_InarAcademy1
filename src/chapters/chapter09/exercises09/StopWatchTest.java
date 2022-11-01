package chapters.chapter09.exercises09;

public class StopWatchTest {
    public static void main(String[] args) {

        int[] array = createArray(100000);

        StopWatch time = new StopWatch();
        sort(array);
        time.stop();
        System.out.println("Array sorted in " + (time.getElapsedTime() / 1000) + " seconds");

    }

    public static int[] createArray(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * number);
        }
        return arr;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
