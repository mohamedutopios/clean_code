package org.example.function.sideEffect;

public class SideEffectExample {

    private static int globalCounter = 0;

    public static void main(String[] args) {
        System.out.println("Before side effect: " + globalCounter);

        // Méthode avec un side effect
        incrementCounter();

        System.out.println("After side effect: " + globalCounter);
    }

    public static void incrementCounter() {
        globalCounter++;
    }
}

