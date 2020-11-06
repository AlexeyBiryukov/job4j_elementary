package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        /*  Item[] itemsWithoutNull = new Item[items.length];
           for (int index = 0; index < items.length; index++) {
               Item id = items[index];
               if (id != null) {
                   itemsWithoutNull[size] = id;
                  size++;
            }
         */
        Item[] rsl = Arrays.copyOf(items, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] itemsWithName = new Item[items.length];
        size = 0;
        for (int index = 0; index < items.length; index++) {
          Item names = items[index];
          if (names.equals(key)) {
              itemsWithName[size] = names;
              size++;
          }
        }
        Item[] rsl = Arrays.copyOf(itemsWithName, size);
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
