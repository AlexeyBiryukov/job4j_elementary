package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height1) {
        double rsl = (187 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height2) {
        double rsl = (180 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 187;
        double man = Fit.manWeight(height1);
        System.out.println("Man 187 is " + man);

        short height2 = 180;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 180 is " + woman);
        }

}

