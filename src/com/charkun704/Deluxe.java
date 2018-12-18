package com.charkun704;

public class Deluxe extends Burger {
    public Deluxe() {
        super("Deluxe", "1/4 lb USDA beef", "sesame", 4);
    }

    @Override
    public void showOrder() {
        totalPrice = totalPrice + 3;
        System.out.println(" Your "+burgerType+" burger cost $"+totalPrice+" with fries and drink.\n");
    }
}
