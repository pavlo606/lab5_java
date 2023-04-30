package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    Pattern pattern;

    public RegularExpression(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public List<String> getMatches(String text) {
        List<String> result = new ArrayList<>();

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(text.substring(matcher.start(), matcher.end()));
        }

        return result;
    }
}
