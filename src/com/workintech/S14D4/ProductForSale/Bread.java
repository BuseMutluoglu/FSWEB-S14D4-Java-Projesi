package com.workintech.S14D4.ProductForSale;

import com.workintech.S14D4.Enum.BreadType;

public class Bread extends ProductForSale{

    private BreadType breadType;
    private int amount;

    public BreadType getBreadType() {
        return breadType;
    }

    public int getAmount() {
        return amount;
    }

    public Bread(String type, double price, String description, int amount, BreadType breadType) {
        super(type, price, description);
        this.amount=amount;
        this.breadType=breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Description: " + getDescription());
    }

    @Override
    public String toString() {
        return "ProductForSale : " + "\n" +
                "Type: " + getType() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Description: " + getDescription() +"\n" +
                "BreadType=" + breadType + "\n" +
                "Amount=" + amount;
    }
}
