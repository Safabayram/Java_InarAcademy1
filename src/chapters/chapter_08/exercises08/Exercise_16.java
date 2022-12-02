package chapters.chapter_08.exercises08;

public class Exercise_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(array);

        for (int[] min : array) {
            System.out.print("(" + min[0] + ", " + min[1] + ")  ");
        }



    }

    public static void sort(int m[][]) {

        for (int i = 0; i < m.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {

                if (m[j][0] < m[minIndex][0]) {
                    minIndex = j;
                }
                else if (m[j][0] == m[minIndex][0]) {
                    if (m[j][1] < m[i][1]) {
                        minIndex = j;
                    }
                }
            }
            if(minIndex != i){

                int temp = m[i][0];
                m[i][0] = m[minIndex][0];
                m[minIndex][0] = temp;

                temp = m[i][1];
                m[i][1] = m[minIndex][1];
                m[minIndex][1] = temp;
            }


        }
    }
}
