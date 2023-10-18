package org.example.variable.demo1;

public class Main {
    public static void main(String[] args) {
        boolean isLoggedIn = true;

        User user = new User();
        user.save();

        if (isLoggedIn) {
            // ...
        }
    }
}
