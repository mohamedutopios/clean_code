package org.example.function.a1Parametre;

public class Main {
    private static boolean isLoggedIn = false;
    private static final String TABLE_BDD = "users";

    public static void main(String[] args) {

        String userEmail = "test@test.com";
        String passWord = "testers";
        User newUser = new User(userEmail,passWord);


        saveUser(userEmail,passWord);
        saveUser(newUser);
        newUser.save();

        toggleLoginStatus();
    }

    public static void saveUser(String email, String passWord){
        User user = new User(email,passWord);
        DataBase.insert(TABLE_BDD,user);
    }

    public static void saveUser(User user){
        DataBase.insert(TABLE_BDD,user);
    }


    public static void toggleLoginStatus() {
        isLoggedIn = !isLoggedIn;
    }
}
