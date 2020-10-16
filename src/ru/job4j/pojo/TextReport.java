package ru.job4j.pojo;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Alexander", "Macedonian");
        System.out.println(text);

        System.out.println();

        JSONReport report1 = new JSONReport();
        String text1 = report1.generate("Alexander", "Macedonian");
        System.out.println(text1);
    }
}
