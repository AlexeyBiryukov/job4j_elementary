package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        check(5);
    }

    public static boolean check(int number) {
        boolean prime = true;
        int hold = 0;

            for (int index = 1; index <= number; index++) {
                hold += index;
                System.out.println("---------------------- ");
                System.out.println("hold: " + hold);
                System.out.println("number: " + number);

                if ((number % hold) == 0) {
                    System.out.println("number % hold: " + (number % hold));
                    prime = false;
                } else {
                    prime = true;
                }
            }
                System.out.println("result: " + prime);
                System.out.println("---------------------- ");
            return prime;
    }
}
