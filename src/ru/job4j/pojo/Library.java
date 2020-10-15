package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Stalker", 500);
        Book book2 = new Book("Clear Code", 1500);
        Book book3 = new Book("Java Code", 2000);
        Book book4 = new Book("Investor", 650);
        Book[] libraries = new Book[4];
        libraries[0] = book1;
        libraries[1] = book2;
        libraries[2] = book3;
        libraries[3] = book4;
        for (int index = 0; index < libraries.length; index++) {
            Book lib = libraries[index];
            System.out.println(lib.getName() + " - " + lib.getCount());
        }
        Book temp = libraries[0];
        libraries[0] = libraries[3];
        libraries[3] = temp;
        System.out.println();
        for (int index = 0; index < libraries.length; index++) {
            Book lib = libraries[index];
            System.out.println(lib.getName() + " - " + lib.getCount());
        }
        System.out.println();
        for (int index = 0; index < libraries.length; index++) {
            Book lib = libraries[index];
            if (lib.getName().equals("Clear Code")) {
                System.out.println(lib.getName());
            }
        }
    }
}
