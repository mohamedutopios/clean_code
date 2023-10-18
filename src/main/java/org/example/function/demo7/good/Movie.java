package org.example.function.demo7.good;

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

    public boolean isValidRating() {

        if (rating == null) {
            return false;
        }

        if (isValidARating())
            return true;

        return isValidBRating();
    }

    private boolean isValidARating() {
        String firstChar = rating.substring(0, 1);

        return firstChar.equalsIgnoreCase("A")
                && rating.length() == 3
                && StringUtils.isNumeric(rating.substring(1, 3));
    }

    private boolean isValidBRating() {
        return VALID_B_RATINGS_LIST.contains(rating);
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}

