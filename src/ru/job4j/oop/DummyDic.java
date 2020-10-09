package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        System.out.println("Привет " + eng);
        return eng;
    }

    public static void main(String[] args) {
        DummyDic say = new DummyDic();
        say.engToRus("Hello");
    }
}