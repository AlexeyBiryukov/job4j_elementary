package ru.job4j.condition;

public class MultiMax {
    public static int max (int first, int second, int third) {
        int result;
        result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("result = " + max(10, 4, 25));
    }
}


