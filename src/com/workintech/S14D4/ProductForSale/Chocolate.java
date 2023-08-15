package com.workintech.S14D4.ProductForSale;

import com.workintech.S14D4.Enum.ChocolateType;

public class Chocolate extends ProductForSale{

    private ChocolateType chocolateType;

    private int amount;
    public Chocolate(String type, double price, String description,int amount,ChocolateType chocolateType) {
        super(type, price, description);
        this.amount=amount;
        this.chocolateType=chocolateType;
    }

    @Override
    public String toString() {
        return "ProductForSale : " + "\n" +
                "Type: " + getType() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Description: " + getDescription() +"\n" +
                "ChocolateType=" + chocolateType + "\n" +
                "Amount=" + amount;
    }

    @Override
    public void showDetails() {
        System.out.println("ProductForSale : " + "\n" +
                "Type: " + getType() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Description: " + getDescription() +"\n" +
                "ChocolateType=" + chocolateType + "\n" +
                "Amount=" + amount + "\n" +
                "Class Type: " + getClass().getSimpleName());

    }
}
