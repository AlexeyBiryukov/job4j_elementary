package ru.job4j.converter;

public class Converter {
        public static int RubleToEvro (int value){
            int rls = value / 70;
            return rls;
        }
        public static int RubleToDollar (int value){
            int rls = value / 60;
            return rls;
        }
        public static void main(String[] args){
            int euro = Converter.RubleToEvro(140);
            System.out.println("140 rubles are " + euro + " euro");

            int dollar = Converter.RubleToDollar(180);
            System.out.println("180 rubles are " + dollar + " dollar");
        }
}
