package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(second, third, fourth);
        return max(first, tmp);
    }
}

