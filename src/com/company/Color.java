package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Color {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private String Color;

    Color(String Color) {
        this.Color = Color;
    }

    private static Color randomColor() {
        List<Color> colors = Arrays.asList(values());
        Random random = new Random();
        int i = random.nextInt(8);
        return colors.get(i);
    }
}
