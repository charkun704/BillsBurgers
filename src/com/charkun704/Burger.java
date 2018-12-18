package com.charkun704;

public class Burger {
    protected String burgerType;
    protected String protein;
    protected String bunType;
    protected double totalPrice;

    private String topping01;
    private double toppingPrice01;

    private String topping02;
    private double toppingPrice02;

    private String topping03;
    private double toppingPrice03;

    private String topping04;
    private double toppingPrice04;

    public Burger(){
        this.burgerType = "Basic";
        this.protein = "1/8 lb. USDA Beef";
        this.bunType = "White";
        this.totalPrice = 2;
    }

    public Burger(String burgerType, String protein, String bunType, double totalPrice) {
        this.burgerType = burgerType;
        this.protein = protein;
        this.bunType = bunType;
        this.totalPrice = totalPrice;
    }


    public void addTopping01(String topping01,double toppingPrice01){
        this.topping01 = topping01;
        this.toppingPrice01 = toppingPrice01;
    }
    public void addTopping02(String topping02,double toppingPrice02){
        this.topping02 = topping02;
        this.toppingPrice02 = toppingPrice02;
    }
    public void addTopping03(String topping03,double toppingPrice03){
        this.topping03 = topping03;
        this.toppingPrice03 = toppingPrice03;
    }
    public void addTopping04(String topping04,double toppingPrice04){
        this.topping04 = topping04;
        this.toppingPrice04 = toppingPrice04;
    }

    public void showOrder(){
        totalPrice = totalPrice + toppingPrice01 + toppingPrice02 + toppingPrice03 + toppingPrice04;
        System.out.println(" Your "+burgerType+" burger cost $"+totalPrice+"\n");
    }
}
