package org.example.variable.demo2.cleanExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String title = "Clean Code Is Great!";
        String description = "Actually, writing Clean Code can be pretty fun. You'll see!";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formattedDate = dateFormat.format(new Date());

        BlogPost blogPost = new BlogPost(title, description, formattedDate);
        blogPost.print();
    }
}
