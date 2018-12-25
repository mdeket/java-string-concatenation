package com.example;

import org.openjdk.jmh.runner.RunnerException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            org.openjdk.jmh.Main.main(args);
        } catch (RunnerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
