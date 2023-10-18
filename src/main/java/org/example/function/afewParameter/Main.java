package org.example.function.afewParameter;

public class Main {


    public static void main(String[] args) {
        int total = sumUp(10, 19, -3, 22, 5, 100);
        System.out.println("Total : " + total);
    }

    public static int sumUp(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
