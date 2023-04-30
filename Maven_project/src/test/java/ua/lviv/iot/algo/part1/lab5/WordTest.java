package ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordTest {
    Word word;

    @BeforeEach
    public void setUp() {
        word = new Word("apple");
    }

    @Test
    public void getConsonantLettersTest() {
        String expected = "ppl";

        assertEquals(expected, word.getConsonantLetters());
    }
}
