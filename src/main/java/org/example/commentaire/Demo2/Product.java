package org.example.commentaire.Demo2;

import java.util.Objects;

/**
 * (c) 2023 Mohamed A. / Utopios
 * This code is distributed under the Apache License, Version 2.0.
 *
 *
 * Created in 2023
 * Contact: mohamed@utopios.net
 *
 * Disclaimer: This code is provided as is and without warranty.
 */

public class Product {
    private String name;
    private double price;

    // Warning: This constructor accepts a null value for 'name'
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // TODO: Implement a method to calculate the total cost of multiple products.
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    /**
     * This method applies a discount to the product's price based on a given percentage.
     *
     * @param discountPercentage The percentage by which to reduce the price.
     * @return The discounted price.
     */
    public double applyDiscount(double discountPercentage) {
        return price - (price * (discountPercentage / 100));
    }
}

