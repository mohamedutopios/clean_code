package org.example.function.a3Parametre2;

public class Main {

    public static void main(String[] args) {
        boolean isSmaller = compare(3, 5, "smaller");
        boolean isEqual = compare(3, 5, "equal");

    }
    public static boolean compare(int first, int second, String comparator) {
        if (comparator.equals("equal")) {
            return first == second;
        } else if (comparator.equals("not equal")) {
            return first != second;
        } else if (comparator.equals("greater")) {
            return first > second;
        } else if (comparator.equals("smaller")) {
            return first < second;
        }
        return false; // Ajout d'un retour par défaut pour éviter un avertissement du compilateur
    }

    public static boolean compare(ComparisonData comparisonData) {
        int first = comparisonData.getFirst();
        int second = comparisonData.getSecond();
        String comparator = comparisonData.getComparator();

        if (comparator.equals("equal")) {
            return first == second;
        } else if (comparator.equals("not equal")) {
            return first != second;
        } else if (comparator.equals("greater")) {
            return first > second;
        } else if (comparator.equals("smaller")) {
            return first < second;
        }
        return false; // Ajout d'un retour par défaut pour éviter un avertissement du compilateur
    }


}
