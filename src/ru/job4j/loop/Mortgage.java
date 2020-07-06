package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            year++;
            amount = (int) (amount + (amount * percent));
            amount = amount - salary;
        }
        System.out.println(year);
        return year;
    }

    public static void main(String[] args) {
        year(100, 70, 50);
    }
}
