package com.workintech.S14D4.ProductForSale;

import com.workintech.S14D4.Enum.CokeType;

public class Coke extends ProductForSale{
    private CokeType cokeType;
    private int amount;
    public Coke(String type, double price, String description,int amount,CokeType cokeType) {
        super(type, price, description);
        this.amount=amount;
        this.cokeType=cokeType;
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
                "CokeType=" + cokeType + "\n" +
                "Amount=" + amount;
    }
}
