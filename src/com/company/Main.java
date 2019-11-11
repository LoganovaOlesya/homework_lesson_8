
/**
 *homework_lesson #8
 * improvement with FindBugs and CheckStyle
 * @version 1.2
 * @author LoganovaOlesya
 */

package com.company;

import com.company.model.Box;
import com.company.model.ChildFine;
import com.company.model.Parent;
import com.company.model.Unicorn;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *Main class.
 * improvement with FindBugs and CheckStyle
 * @version 1.2
 * @author LoganovaOlesya
 */
public final class Main {

    private Main() {
        //NOP
    }

    /**
     * @version 1.2
     * @autor LoganovaOlesya
     * @param args from command line
     */
    public static void main(final String[] args) {

        Scanner saySomething = new Scanner(System.in, "UTF-8");
        String message;

        System.out.println("Hi! Write something");
        System.out.print("> ");

        message = saySomething.nextLine();
        Utils.print(message);

        System.out.println("What is your favorite color?"
                + "\nBlack"
                + "\nRed"
                + "\nGreen"
                + "\nYellow"
                + "\nBlue"
                + "\nPurple"
                + "\nCyan"
                + "\nWhite");

        System.out.print("> ");

        message = saySomething.nextLine();

        switch (message) {
            case "Black":
                Utils.print(message, Color.BLACK);
                break;
            case "Red":
                Utils.print(message, Color.RED);
                break;
            case "Green":
                Utils.print(message, Color.GREEN);
                break;
            case "Yellow":
                Utils.print(message, Color.YELLOW);
                break;
            case "Blue":
                Utils.print(message, Color.BLUE);
                break;
            case "Purple":
                Utils.print(message, Color.PURPLE);
                break;
            case "Cyan":
                Utils.print(message, Color.CYAN);
                break;
            case "White":
                Utils.print(message, Color.WHITE);
                break;
            default:
                System.out.println(
                "I don't know what you talking about. Try again");
                break;
        }
        workWithBox();

        List<Parent> family = Arrays.asList(new Parent(), new ChildFine());
        for (Parent familyMember : family) {
            familyMember.setName().setHand();
        }

        System.out.println(Utils.randomObject(
        new Unicorn(), 1, "custom string"));
    }

    private static void workWithBox() {
        Box<String> myBox = new Box<>();
        Box<Unicorn> boxWithUnicorn = new Box<>();

        try {
            myBox.putInBox("my custom string");
            boxWithUnicorn.putInBox(new Unicorn());
            System.out.println(boxWithUnicorn.getOutOfBox());
            System.out.println(myBox.getOutOfBox());

            boxWithUnicorn.deleteFromBox();

        } catch (RuntimeException e) {
            System.out.println("something went wrong: " + e.getMessage());
        }

    }

}

