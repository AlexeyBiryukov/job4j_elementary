package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] array = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            array[i] = board[i][i];
        }
        return array;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i][i] == 'X') {
                if (monoVertical(board, i) || monoHorizontal(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}