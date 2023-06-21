package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextManager {
    private String text;

    public List<String> getWordsStartsWithVowel() {
        List<String> result = new ArrayList<>();

        Pattern expression = Pattern.compile("(?<!\\w)[ieaouIEAOU]\\w+");
        Matcher matcher = expression.matcher(text);

        while (matcher.find()) {
            result.add(text.substring(matcher.start(), matcher.end()));
        }

        return result;
    }

    public List<String> sortWords() {
        List<String> words = getWordsStartsWithVowel();

        return words.stream()
                       .sorted(Comparator.comparing(word -> getConsonantLetters(word)))
                       .collect(Collectors.toList());
    }

    public String getConsonantLetters(final String word) {
        List<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile("[^ieaouIEAOU]");
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            result.add(word.substring(matcher.start(), matcher.end()));
        }

        return String.join("", result);
    }
}
