package com.example;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class Concatenation {

    private final String[] letters = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu".split("(?!^)");

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @Fork(1)
    public String concatenate() {
        String result = "";
        for (String letter : letters) {
            result += letter;
        }
        return result;
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @Fork(1)
    public String concatenateWithStringBuilder() {
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

}
