package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenationTest {

    private final String testString = "Vega IT Sourcing";
    private final String[] letters = testString.split("(?!^)");

    @Test
    public void lettersLengthEqualsTestStringLength() {
        assertEquals(letters.length, testString.length());
    }

    @Test
    public void lettersEqualToTestString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String letter : letters) {
            stringBuilder.append(letter);
        }
        assertEquals(stringBuilder.toString(), testString);
    }

    @Test
    public void concatenateEqualsToTestString() {
        Concatenation concatenation = new Concatenation();
        assertEquals(concatenation.concatenate(), testString);
    }

    @Test
    public void concatenateWithStringBuilderEqualsToTestString() {
        Concatenation concatenation = new Concatenation();
        assertEquals(concatenation.concatenateWithStringBuilder(), testString);
    }

}
