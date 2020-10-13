package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Alexey Biryukov");
        student.setGroup("10-21");
        student.setDate("13.10.2020");

        System.out.println(student.getFio() + " studying in a group " + student.getGroup() + " from " + student.getDate());
    }
}
