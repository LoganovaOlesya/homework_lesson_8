package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.Constants.ANSI_RESET;

public class Utils {
    private static List<Object> objects = new ArrayList<>();

    public static void print(String text) {
        System.out.println("Here is your text: " + text);
    }

    public static void print(String text, Color color) {
        System.out.println("Here is your color text: " + color + text + ANSI_RESET);
    }

    public static <T, R, E> Object randomObject(T firstObject, R secondObject, E thirdObject) {
        Random random = new Random();

        objects.add(firstObject);
        objects.add(secondObject);
        objects.add(thirdObject);

        int i = random.nextInt(2);

        return objects.get(i);

    }
}
