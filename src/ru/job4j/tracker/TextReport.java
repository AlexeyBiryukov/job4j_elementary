package ru.job4j.tracker;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Alexander", "Macedonian");
        System.out.println(text);
    }
}
