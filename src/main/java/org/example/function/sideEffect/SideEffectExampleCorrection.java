package org.example.function.sideEffect;

public class SideEffectExampleCorrection {
    public static void main(String[] args) {
        int globalCounter = 0; // Déclarer et initialiser la variable dans le même contexte

        System.out.println("Before side effect: " + globalCounter);

        // Appeler la méthode qui retourne le résultat au lieu de modifier une variable globale
        int incrementedCounter = incrementCounter(globalCounter);

        System.out.println("After side effect: " + incrementedCounter);
    }

    public static int incrementCounter(int counter) {
        return counter + 1; // Retourner une nouvelle valeur au lieu de modifier l'état global
    }
}
