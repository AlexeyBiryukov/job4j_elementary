package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean run = true;
        System.out.println("Добро пожаловать в игру 11! ");
        System.out.println();
        System.out.println("!!! ПРАВИЛА ИГРЫ !!! ");
        System.out.println("1. На столе лежат 11 спичек.");
        System.out.println("2. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("3. Выигрывает тот, кто забрал последние спички.");
        System.out.println();

        while (run) {
            while (run) {
                for (int i = 0; i < matches; i++) {
                    System.out.println("Возьмите от 1й до 3х спичек ");
                    int select1 = Integer.valueOf(input.nextLine());
                    if (select1 < 1 || select1 > 3) {
                        System.out.println("Вы ввели неверное число");
                        System.out.println("На столе " + matches + " спичек");
                    } else if (select1 > 0 || select1 <= 3) {
                        matches = matches - select1;
                        System.out.println("На столе " + matches + " спичек");
                        System.out.println("-------------------------------");
                    } if (matches == 0) {
                        run = false;
                    }
                }
            }
        }
    }
}
