
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.company.Constants.ANSI_RESET;

/**
 *
 */

public class Utils {
    /**
     *
     */
    public Utils() { }

    /**
     *
     */
    private static List<Object> objects = new ArrayList<>();

    /**
     *
     */
    static void print(final String text) {
        System.out.println("Here is your text: " + text);
    }

    /**
     *
     */
    static void print(final String text, final Color color) {
        System.out.println(color
                + "Here is your color text: "
                + text + ANSI_RESET);
    }

    /**
     *
     */
    static <T, R, E> Object randomObject(
            final T firstObject,
            final R secondObject,
            final E thirdObject
    ) {
        Random random = new Random();

        objects.add(firstObject);
        objects.add(secondObject);
        objects.add(thirdObject);

        int i = random.nextInt(2);

        return objects.get(i);

    }
}
