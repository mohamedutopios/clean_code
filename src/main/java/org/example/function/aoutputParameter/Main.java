package org.example.function.aoutputParameter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Max");
        user.addId();
        System.out.println(user);

        User customer = new User("Louis");
        addId(customer);
        System.out.println(customer);
    }

    public static void addId(User user){
        user.id = "u2";
    }


}
