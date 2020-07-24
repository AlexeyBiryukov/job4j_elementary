package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            for (int index2 = 0; index2 < pref.length; index2++) {
                if (word.length == pref.length) {
                    break;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
