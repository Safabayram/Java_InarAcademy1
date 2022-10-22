package week_11;

import java.util.Scanner;
import java.io.*;

public class Exercise_8_20 {
    private static Scanner input = new Scanner(System.in);
    private final static int row = 6;
    private final static int col = 7;


    private static int[][] board = new int[row][col];
    private static boolean isRedTurn = true;


    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        do {
            askUserForInput();
            int usersEntry = input.nextInt();
            if (!isValid(usersEntry)) {
                System.out.println("Invalid entry!");
                continue;
            }
            processEntryToTheBoard(usersEntry);
            display1();
        } while (!isGameOver());

    }

    private static boolean isGameOver() {
        if (sameRow() || sameCol() || rightDiagonal() || leftDiagonal()) { // wining case
            System.out.printf("Congratulations!!!\n%s WINS!!!!", isRedTurn ? "RED" : "YELLOW");
            return true;
        } else if (isTheBoardFull()) {//draw case
            System.out.println("Game is over! It's a DRAW!!");
            return true;
        } else {//keep playing
            isRedTurn = !isRedTurn;
            return false;
        }
    }

    private static boolean sameRow() {
        int num = isRedTurn ? 1 : 2;
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == num) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sameCol() {
        int num = isRedTurn ? 1 : 2;
        int counter = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[j][i] == num) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean rightDiagonal() {
        int num = isRedTurn ? 1 : 2;
        int counter = 0;
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < col - 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j + k] == num) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                    if (counter == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean leftDiagonal() {
        int num = isRedTurn ? 1 : 2;
        int counter = 0;
        for (int i = 0; i < row - 3; i++) {
            for (int j = 3; j < col; j++) {
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j - k] == num) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                    if (counter == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isTheBoardFull() {
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 0) {
                return false;
            }
        }
        return true;
    }

    private static void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = ' ';
                if (board[i][j] == 1) {
                    c = 'R';
                } else if (board[i][j] == 2) {
                    c = 'Y';
                }
                System.out.printf("|%3s", "" + c);
            }
            System.out.println("|");
        }
        System.out.println("\n");
    }

    private static void display1() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = ' ';
                System.out.print("| ");
                if (board[i][j] == 1) {
                    System.out.print(ANSI_RED + "R" + ANSI_RESET);
                } else if (board[i][j] == 2) {
                    System.out.print(ANSI_YELLOW + "Y" + ANSI_RESET);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("\n");
    }

    private static void processEntryToTheBoard(int usersEntry) {

        for (int i = 1; i < row; i++) {
            if (board[i][usersEntry] != 0) {
                board[i - 1][usersEntry] = isRedTurn ? 1 : 2;
                return;
            }
        }
        board[row - 1][usersEntry] = isRedTurn ? 1 : 2;
    }

    private static boolean isValid(int usersEntry) {
        if (0 > usersEntry || usersEntry >= col) {
            return false;
        } else if (isTheColFull(usersEntry)) {
            return false;
        }
        return true;
    }

    private static boolean isTheColFull(int usersEntry) {
        return board[0][usersEntry] != 0;
    }

    private static void askUserForInput() {
        String color = isRedTurn ? "Red" : "Yellow";
        System.out.printf("Drop a %s disk at column (0–6):", color);
    }

}
