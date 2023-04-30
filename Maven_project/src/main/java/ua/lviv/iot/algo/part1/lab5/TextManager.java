package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextManager {
    String text;
    int len;

    public List<String> getWordsStartsWithVowel() {
        List<String> result = new ArrayList<>();

        RegularExpression expression = new RegularExpression("(?<!\\w)[ieaouIEAOU]\\w+");
        result = expression.getMatches(text);

        return result; 
    }

    public List<String> sortWords() {
        List<String> result = new ArrayList<>();
        List<String> words = getWordsStartsWithVowel();
        
        result = words.stream()
                       .sorted(Comparator.comparing(word -> new Word(word).getConsonantLetters()))
                       .toList();

        return result;
    }
}
