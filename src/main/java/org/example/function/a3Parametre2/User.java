package org.example.function.a3Parametre2;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static void main(String[] args) {
        User user = new User("Max", 31, "max@test.com");
    }
}
