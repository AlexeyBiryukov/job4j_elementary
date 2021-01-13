package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        Scanner p2 = new Scanner(System.in);
        int matches = 11;
        System.out.println("Добро пожаловать в игру 11! ");
        System.out.println();
        System.out.println("!!! ПРАВИЛА ИГРЫ !!! ");
        System.out.println("1. На столе лежат 11 спичек.");
        System.out.println("2. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("3. Выигрывает тот, кто забрал последние спички.");
        System.out.println();

        for (int i = 0; i < matches; i++) {
            System.out.println("Ход первого игрока");
            int select1 = Integer.valueOf(p1.nextLine());
            if (select1 < 1 || select1 > 3) {
                System.out.println("Вы ввели неверное число");
            } else if (select1 > 0 || select1 <=3) {
                matches = matches - select1;
                System.out.println("На столе " + matches + " спичек");
                System.out.println("-------------------------------");
            }
            System.out.println("Ход второго игрока");
            int select2 = Integer.valueOf(p2.nextLine());
            if (select2 < 1 || select2 > 3) {
                System.out.println("Вы ввели неверное число");
            } else if (select2 > 0 || select2 <=3) {
                matches = matches - select2;
                System.out.println("На столе " + matches + " спичек");
                System.out.println("-------------------------------");
            }
        }
    }
}
