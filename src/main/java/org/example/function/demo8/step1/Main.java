package org.example.function.demo8.step1;

public class Main {

    private DataBase dataBase;
    public void createUser(String email, String password) {

        if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
            System.out.println("Both email and password must be provided!");
            return;
        }

        if (!email.contains("@") ||
                !password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]$") ||
                password.length() < 7) {
            System.out.println("Email or password is invalid!");
            return;
        }

        User user = new User(email, password);
        String query = "INSERT INTO users VALUES ('" + user.getEmail() + "', '" + user.getPassword() + "')";
        dataBase.runQuery(query);
    }

}
