package org.example.function.a3Parametre;

public class Main {

    public static void main(String[] args) {
        login("mohamed@gmail.com", "12345");
        log("Hi there!", false);
        log("Hi there!");
        logError("An error!");

    }

    private static void login(String email, String password){
        System.out.println("email " + email + " " + "password " + password);
    }

    public static void log(String message, boolean isError) {
        if (isError) {
            System.err.println(message);
        } else {
            System.out.println(message);
        }
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static void logError(String errorMessage) {
        System.err.println(errorMessage);
    }

}
