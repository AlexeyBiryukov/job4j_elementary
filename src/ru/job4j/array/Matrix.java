package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int line = 0; line < table[row].length; line++) {
                    table[row][line] = (row + 1) * (line + 1);
            }
        }
        return table;
    }
}
