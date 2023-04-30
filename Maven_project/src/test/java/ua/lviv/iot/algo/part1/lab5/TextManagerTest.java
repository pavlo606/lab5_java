package ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextManagerTest {
    String inputString;
    TextManager text;

    @BeforeEach
    public void setUp() {
        inputString = "apple banana yellow event orange android";
        text = new TextManager(inputString, 5);
    }

    @Test
    public void getWordsStartsWithVowelTest() {
        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("event");
        expected.add("orange");
        expected.add("android");

        assertEquals(expected, text.getWordsStartsWithVowel());
    }

    @Test
    public void sortWordsTest() {
        List<String> expected = new ArrayList<>();
        expected.add("android");
        expected.add("apple");
        expected.add("orange");
        expected.add("event");

        assertEquals(expected, text.sortWords());
    }
}
