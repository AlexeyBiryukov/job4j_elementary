package ru.job4j.condition;

public class BooleanLogic {
    public static boolean eat(boolean egg, boolean pan) {
        boolean breakfast = (egg && pan);
        return breakfast;
    }

    public static boolean parking(boolean car, boolean crash) {
        boolean parkingCar = (car || crash);
        return parkingCar;
    }

    public static void main(String[] args) {
        boolean result = eat(true, true);
        System.out.println("eat " + result);
        boolean rsl = parking(true, true);
        System.out.println("Parking " + rsl);
        boolean result1 = eat(false, true);
        System.out.println("eat " + result1);
        boolean rsl1 = parking(false, true);
        System.out.println("Parking " + rsl1);
        boolean result2 = eat(true, false);
        System.out.println("eat " + result2);
        boolean rsl2 = parking(true, false);
        System.out.println("Parking " + rsl2);
        boolean result3 = eat(false, false);
        System.out.println("eat " + result3);
        boolean rsl3 = parking(false, false);
        System.out.println("Parking " + rsl3);

    }
}

