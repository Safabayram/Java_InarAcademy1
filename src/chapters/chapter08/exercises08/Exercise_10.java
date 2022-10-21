package chapters.chapter08.exercises08;

public class Exercise_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j] = (int)(Math.random() * 2);

            }

        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();

        }

        System.out.println("The largest row index :  " + getLargestRow(matrix));
        System.out.println("The largest row column : " + getLargestColumn(matrix));
    }
    public  static int getLargestRow(int[][] arr){
        int max = 0;
        int maxRowIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    counter++;
                }

            }
            if (counter > max){
                max = counter;
                maxRowIndex = i;
            }


        }
        return maxRowIndex;
    }
    public static int getLargestColumn(int [][] arr){
        int max = 0;
        int maxColIndex = -1;
        for (int i = 0; i <arr[0].length ; i++) {
            int counter =0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[j][i] ==1){
                    counter++;
                }

            }
            if ((counter > max)){
                max = counter;
                maxColIndex = i;
            }


        }
        return maxColIndex;

    }
}
