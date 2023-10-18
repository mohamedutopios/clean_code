package org.example.variable.tp2.enonce;

import java.util.ArrayList;
import java.util.List;

public class BadShoppingCart {
    private List<BadItem> itemList;

    public BadShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void add(BadItem i) {
        itemList.add(i);
    }

    public void remove(BadItem i) {
        itemList.remove(i);
    }

    public double calculate() {
        double total = 0.0;
        for (BadItem i : itemList) {
            total += i.gP();
        }
        return total;
    }

    public void receipt() {
        System.out.println("Receipt:");
        for (BadItem i : itemList) {
            System.out.println(i.gN() + " - $" + i.gP());
        }
        System.out.println("Total: $" + calculate());
    }
}

