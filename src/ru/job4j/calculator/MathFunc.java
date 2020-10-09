package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        x = x * x + 1;
        return x;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        System.out.println(result1);
        int result2 = MathFunc.func2(100);
        System.out.println(result2);
    }
}
