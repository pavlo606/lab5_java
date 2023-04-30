package ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegularExpressionTest {
    String text = "apple banana yellow event orange android";
    String regex = "(?<!\\w)[ieaouIEAOU]\\w+";
    List<String> expected = new ArrayList<>();
    RegularExpression expression;

    @BeforeEach
    public void setUp() {
        expression = new RegularExpression(regex);

        expected.add("apple");
        expected.add("event");
        expected.add("orange");
        expected.add("android");
    }

    @Test
    public void getMatchesTest() {
        assertEquals(expected, expression.getMatches(text));
    }
}
