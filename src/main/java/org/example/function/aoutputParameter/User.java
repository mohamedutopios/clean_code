package org.example.function.aoutputParameter;

class User {
    String name;
    String id;

    User(String name) {
        this.name = name;
    }

    void addId() {
        this.id = "u1";
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', id='" + id + "'}";
    }
}
