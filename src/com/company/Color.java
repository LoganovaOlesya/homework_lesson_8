package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.company.O.UIYIH;

/**
 *enum color.
 */
public enum Color {

    /**
     * enum RESET.
     */
    RESET("\u001B[0m"),

    /**
     *enum BLACK.
     */
    BLACK("\u001B[30m"),

    /**
     *enum RED.
     */
    RED("\u001B[31m"),

    /**
     *enum GREEN.
     */
    GREEN("\u001B[32m"),

    /**
     *enum YELLOW.
     */
    YELLOW("\u001B[33m"),

    /**
     *enum BLUE.
     */
    BLUE("\u001B[34m"),

    /**
     *enum PURPLE.
     */
    PURPLE("\u001B[35m"),

    /**
     *enum CYAN.
     */
    CYAN("\u001B[36m"),

    /**
     *enum WHITE.
     */
    WHITE("\u001B[37m");

    /**
     *string variable for color text.
     */
    private String color;

    Color(final String colorIn) {
        this.color = colorIn;
    }


    private static Color randomColor() {
        List<Color> colors = Arrays.asList(values());
        Random random = new Random();
        int i = random.nextInt(UIYIH);
        return colors.get(i);
    }
}
