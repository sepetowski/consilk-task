package com.consilk.recruitment.view;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class View {
    private final Scanner scanner;

    /**
     * Constructs a new View object with a default Scanner for user input.
     */
    public View() {
        this.scanner = new Scanner(in);
    }

    /**
     * Displays the provided message to the console.
     *
     * @param message The message to be displayed.
     */
    public void showMessage(String message) {
        out.println(message);
    }

    /**
     * Retrieves user input from the console.
     *
     * @return The user input as a String.
     */
    public String returnUserInput() {
        return scanner.nextLine();
    }

    /**
     * Closes the scanner associated with the view.
     */
    public void closeScanner() {
        scanner.close();
    }

    /**
     * Displays the generated pattern of stars
     *
     * @param stars An ArrayList containing the pattern of stars to be displayed.
     */
    public void showGeneratedStars(ArrayList<String> stars) {
        stars.forEach(this::showMessage);
    }
}
