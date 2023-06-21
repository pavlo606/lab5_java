package ua.lviv.iot.algo.part1.lab5;

public class Text {
    public static void main(String... args) {
        String inputString = String.join(" ", args);

        TextManager manager = new TextManager(inputString);

        System.out.println("Sorted text:");
        System.out.println(String.join(" ", manager.sortWords()));
    }
}
