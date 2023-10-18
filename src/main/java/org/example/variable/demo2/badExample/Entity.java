package org.example.variable.demo2.badExample;

import java.text.SimpleDateFormat;
import java.util.Date;

class Entity {
    private String title;
    private String description;
    private String ymdhm;

    public Entity(String title, String description, String ymdhm) {
        this.title = title;
        this.description = description;
        this.ymdhm = ymdhm;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getYmdhm() {
        return ymdhm;
    }
}

