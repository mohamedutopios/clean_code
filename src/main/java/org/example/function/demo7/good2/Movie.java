package org.example.function.demo7.good2;

import org.example.function.demo7.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Movie {

    private static final List<String> VALID_B_RATINGS_LIST
            = Arrays.asList("B1", "B2", "B3", "B4");

    String rating;

    public Movie(String rating) {
        super();
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    /*Axx or By
    Where x represents any digit between 0 and 9, and y represents
    any digit between 1 and 4*/
    public boolean isValidRating() {
        if (this.getRating() != null) {
            String rating = this.getRating();

            if (rating.matches("[AB]\\d{2}") || rating.matches("[AB][1-4]")) {
                return true;
            }
        }
        return false;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}

