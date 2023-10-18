package org.example.variable.demo2.betteExample;

import java.text.SimpleDateFormat;
import java.util.Date;

class BlogPost {
    private String title;
    private String description;
    private String datePublished;

    public BlogPost(String title, String description, String datePublished) {
        this.title = title;
        this.description = description;
        this.datePublished = datePublished;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDatePublished() {
        return datePublished;
    }
}

