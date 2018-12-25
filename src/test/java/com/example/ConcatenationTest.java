package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenationTest {

    private final String testString = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
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
    public void concatenateResultEqualsToTestString() {
        Concatenation concatenation = new Concatenation();
        assertEquals(concatenation.concatenate(), testString);
    }

    @Test
    public void concatenateWithStringBuilderResultEqualsToTestString() {
        Concatenation concatenation = new Concatenation();
        assertEquals(concatenation.concatenate(), testString);
    }

}
