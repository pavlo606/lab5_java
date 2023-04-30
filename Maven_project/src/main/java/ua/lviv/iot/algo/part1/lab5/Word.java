package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Word {
    String text;

    public String getConsonantLetters() {
        List<String> result = new ArrayList<>();

        RegularExpression expression = new RegularExpression("[^ieaouIEAOU]");
        result = expression.getMatches(text);

        return String.join("", result);
    }
}
