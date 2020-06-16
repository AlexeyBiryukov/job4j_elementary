package ru.job4j.converter;

public class Converter {
        public static int rubleToEvro(int value) {
            int rls = value / 70;
            return rls;
        }
        public static int rubleToDollar(int value) {
            int rls = value / 60;
            return rls;
        }
        public static void main(String[] args) {
            int euro = Converter.rubleToEvro(140);
            System.out.println("140 rubles are " + euro + " euro");

            int dollar = Converter.rubleToDollar(180);
            System.out.println("180 rubles are " + dollar + " dollar");
        }
}
