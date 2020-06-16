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
          int in1 = 140;
          int expected1 = 2;
          int out1 = rubleToEvro(in1);
          boolean passed1 = expected1 == out1;
          System.out.println("140 rubles are 2 evro. Test result : " + passed1);

          int in2 = 140;
          int expected2 = 2;
          int out2 = rubleToDollar(in2);
          boolean passed2 = expected2 == out2;
          System.out.println("140 rubles are 2 dollar. Test result : " + passed2);
        }
}
