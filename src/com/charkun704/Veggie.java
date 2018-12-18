package com.charkun704;

public class Veggie extends Burger {
    private String topping05;
    private double toppingPrice05;
    private String topping06;
    private double toppingPrice06;

    public Veggie() {
        super("Veggie","Tofu","Gluten-free",3);
    }

    public void addTopping05(String topping05,double toppingPrice05){
        this.topping05 = topping05;
        this.toppingPrice05 = toppingPrice05;
    }
    public void addTopping06(String topping06,double toppingPrice06){
        this.topping06 = topping06;
        this.toppingPrice06 = toppingPrice06;
    }

    @Override
    public void showOrder() {
        totalPrice = totalPrice + toppingPrice05 + toppingPrice06;
        System.out.println(" Your "+burgerType+" burger cost $"+totalPrice+" with "+topping05+" and "+
                topping06+".\n");
    }
}
