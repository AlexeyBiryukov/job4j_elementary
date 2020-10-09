package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare Zayac = new Hare();
        Wolf Volk = new Wolf();
        Fox Lisa = new Fox();
        kolobok.tryEat(kolobok);
        Zayac.tryEat(kolobok);
        Volk.tryEat(kolobok);
        Lisa.tryEat(kolobok);
    }
}
