package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] == data[index + 1]) {
                return result;
            } else {
                result = false;
            }
        }
        return result;
    }
}