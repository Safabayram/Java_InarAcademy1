package chapters.chapter07.exercises07;

public class Exercise_22 {
    public static void main(String[] args) {
        int [] chessTable = new int[8];
        int row = 0;

        while (row < chessTable.length){
            if(isThereAPlace(chessTable,row)){
                queen(chessTable,row);
                row++;
            }else{
                row = 0;
            }
        }

        display(chessTable);

    }

    public static void queen(int[] chessTable, int row) {
        int queenIndex ;
        while (true){
            queenIndex = (int)(Math.random() * 8);
            if (isCorrectPlace(queenIndex,chessTable,row)){
                break;
            }
        }
        chessTable[row] = queenIndex;

    }

    private static boolean isCorrectPlace(int queenIndex, int[] chessTable,int row) {
        boolean [] places = new boolean[8];
        java.util.Arrays.fill(places,true);

        for (int i = 0; i <row ; i++) {
            places[chessTable[i]] = false;
            if ((chessTable[i] + (row - i)) < 8){
                places[chessTable[i] + (row - i)]= false;
            }
            if ((chessTable[i] - (row - i))> 0) {
                places[chessTable[i] - (row - i)]= false;
            }
        }
        return true;
    }

    public static boolean isThereAPlace(int[] chessTable, int row) {
        boolean[] places = new boolean[8];
        java.util.Arrays.fill(places,true);
        for (int i = 0; i < row; i++) {
            places[chessTable[i]] =false;
            if ((chessTable[i] + (row - i ))< 8){
                places[chessTable[i] +(row - i)]= false;
            }
            if((chessTable[i] - (row - i )) > 0) {
                places[chessTable[i] - (row - i)] = false;
            }

        }
        for (int i = 0; i < places.length ; i++) {
            if(places[i]){
                return true;
            }

        }
        return false;



    }
    public static void display(int [] table){
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            for (int j = 0; j < table[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q| ");

            for (int j = table[i] + 1; j < table.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }

    }

}
