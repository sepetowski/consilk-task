package com.consilk.recruitment.controller;

import com.consilk.recruitment.model.Model;
import com.consilk.recruitment.view.View;

import java.util.ArrayList;


public class Controller {

    private final Model model;
    private final View view;


    /**
     * Constructs a new Controller instance with the specified model and view.
     *
     * @param model The model component of the application.
     * @param view  The view component of the application.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Runs the controller to manage the generation of the pattern based on user input.
     */
    public void runController() {
        int rows = getUserInput();
        ArrayList<String> stars = model.generatePattern(rows);
        view.showGeneratedStars(stars);
    }

    /**
     * Retrieves user input for the number of rows to generate.
     *
     * @return The number of rows inputted by the user.
     */
    private int getUserInput() {
        int convertedValue;
        view.showMessage("Provide number of rows to generate");
        do {
            convertedValue = parseStringToNumber(view.returnUserInput());
            if (convertedValue <= 0) view.showMessage("Provide a valid number greater than 0");
        } while (convertedValue <= 0);
        view.closeScanner();
        return convertedValue;
    }

    /**
     * Parses a string to an integer.
     *
     * @param string The string to be parsed.
     * @return The integer value parsed from the string, or -1 if parsing fails.
     */
    private int parseStringToNumber(String string) {
        boolean error = false;
        int number = 0;

        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            error = true;
        }

        if (error) {
            return -1;
        } else {
            return number;
        }
    }
}
