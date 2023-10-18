package org.example.function.a1Parametre;

import java.util.UUID;

class User {
    private String id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
    }

    public void save() {
        // Supposons que db.insert est une méthode statique de la classe Db
        DataBase.insert("users", this);
    }
}
