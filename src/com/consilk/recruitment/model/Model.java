package com.consilk.recruitment.model;

import java.util.ArrayList;

public class Model {

    private final ArrayList<String> stars;

    public Model() {
        this.stars = new ArrayList<>();
    }

    /**
     * Generates a pattern of stars based on the specified number of rows.
     *
     * @param numberOfRows The number of rows for which to generate the pattern.
     * @return An ArrayList containing the generated pattern of stars.
     */
    public ArrayList<String> generatePattern(int numberOfRows) {
        int previousNumStars = 0;

        for (int i = 0; i < numberOfRows; i++) {
            if (i == 0) {
                previousNumStars = 1;
                generateStars(previousNumStars);
            } else {
                if (i % 2 != 0) {
                    previousNumStars = previousNumStars + 2;
                    generateStars(previousNumStars);

                } else {
                    previousNumStars = previousNumStars - 1;
                    generateStars(previousNumStars);
                }
            }

        }
        return stars;
    }

    /**
     * Generates a string of stars and adds it to the stars ArrayList.
     *
     * @param numberOfStars The number of stars to generate for the current row.
     */
    private void generateStars(int numberOfStars) {
        stars.add("*".repeat(Math.max(0, numberOfStars)));
    }
}
