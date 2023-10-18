package org.example.function.demo8.step2;

public class Main {

    private static DataBase dataBase;
    public void createUser(String email, String password) {
        if (!userDataIsValid(email, password)) {
            showValidationErrorMessage();
            return;
        }
        User user = buildUser(email, password);
        saveUserToDatabase(user);
    }

    public static boolean userDataIsValid(String email, String password) {
        return emailIsValid(email) && passwordIsValid(password);
    }

    public static boolean emailIsValid(String email) {
        return email != null && email.contains("@") && !email.isEmpty() ;
    }

    public static void showValidationErrorMessage() {
        System.out.println("Invalid input!");
    }

    public static boolean passwordIsValid(String password) {
        return password != null && !password.trim().isEmpty()||
                !password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]$") ||
                password.length() < 7;
    }

    public static User buildUser(String email, String password) {
        return new User(email, password);
    }

    public static void saveUserToDatabase(User user) {
        String query = "INSERT INTO users VALUES ('" + user.getEmail() + "', '" + user.getPassword() + "')";
        dataBase.runQuery(query);

    }

}
