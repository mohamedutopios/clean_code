package org.example.function.demo9.solution;

import org.example.function.demo9.solution.DataBase;

public class Main {

    private static DataBase dataBase;
        public static void createUser(String email, String password) {
            if (!inputIsValid(email, password)) {
                showErrorMessage("Invalid input!");
                return;
            }

            saveUser(email, password);
        }
        public static void createSupportChannel(String email) {
            if (!emailIsValid(email)) {
                showErrorMessage("Invalid email - could not create channel");
                return;
            }
        }


        public static boolean inputIsValid(String email, String password) {
            return emailIsValid(email) && passwordIsValid(password);
        }

        public static boolean emailIsValid(String email) {
            return email != null && email.contains("@");
        }

        public static boolean passwordIsValid(String password) {
            return password != null && !password.trim().isEmpty();
        }

        public static void showErrorMessage(String message) {
            System.out.println(message);
        }

        public static void saveUser(String email, String password) {
            User user = buildUser(email, password);

            dataBase.runQuery(user);
        }

        public static User buildUser(String email, String password) {
            return new User(email, password);
        }


}
