/*package chapters.chapter08.sampleQuestions;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int [][]sudoku = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        if (isValidSudoku(sudoku)){
            System.out.println("valid sudoku");
        }else {
            System.out.println("invalid sudoku");
        }




    }

    private static boolean isValidSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length ; i++) {
            for (int j = 0; j <sudoku[i].length ; j++) {
                if (sudoku[i][j] < 1|| sudoku[i][j] > 9){
                    return false;
                }

            }

        }
        for (int i = 0; i < sudoku.length ; i++) {
            boolean []check = new boolean[9];
            for (int j = 0; j < sudoku[i].length ; j++) {
                check

            }

        }

    }


}*/
