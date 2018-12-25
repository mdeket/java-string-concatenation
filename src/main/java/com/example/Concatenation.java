package com.example;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class Concatenation {

    private final String[] words = new String[]{"V", "e", "g", "a", " ", "I", "T", " ", "S", "o", "u", "r", "c", "i", "n", "g"};

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @Fork(1)
    public String concatenate() {
        String result = "";
        for (String word : words) {
            result += word;
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
        for (String word : words) {
            builder.append(word);
        }
        return builder.toString();
    }

}
