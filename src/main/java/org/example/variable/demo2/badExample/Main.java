package org.example.variable.demo2.badExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void output(Entity item) {
        System.out.println("Title: " + item.getTitle());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Published: " + item.getYmdhm());
    }

    public static void main(String[] args) {
        String summary = "Clean Code Is Great!";
        String desc = "Actually, writing Clean Code can be pretty fun. You'll see!";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String publish = dateFormat.format(new Date());

        Entity item = new Entity(summary, desc, publish);

        output(item);
    }
}
