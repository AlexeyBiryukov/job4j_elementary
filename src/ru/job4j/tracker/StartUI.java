package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        Item item2 = new Item();

        item1.setName("Number #1");
        item2.setName("Number #2");

        tracker.add(item1);
        tracker.replace(1, item2);

        System.out.println(tracker.findById(1));
    }
}