package org.example.function.a2Parametre;

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public void log() {
        System.out.println(this.message);
    }
}
