package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String deadfish = "iiisdosodddddiso";
        DeadFishParser deadfishParser = new DeadFishParser();

        System.out.println(Arrays.toString(deadfishParser.parse(deadfish)));

    }
}