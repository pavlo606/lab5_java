package ua.lviv.iot.algo.part1.lab5;

public class Main {
    private TextManager text;

    public Main(String text, int length) {
        this.text = new TextManager(text, length);
    }

    public String sort() {
        return String.join(" ", text.sortWords());
    }

    public static void main(String... args) {
        String inputString = String.join(" ", args);

        RegularExpression intPattern = new RegularExpression("\\d+");
        RegularExpression notIntPattern = new RegularExpression("\\D+");

        try {
            int length = Integer.parseInt(String.join("", intPattern.getMatches(inputString)));
            String text = String.join("", notIntPattern.getMatches(inputString));

            Main manager = new Main(text, length);

            System.out.println("Sorted text:");
            System.out.println(manager.sort());
        } catch (NumberFormatException e) {
            System.out.println("You need to write length");
        }
    }
}
