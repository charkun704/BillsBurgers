package com.charkun704;

public class Main {

    public static void main(String[] args) {
        Burger order01 = new Burger();
        order01.addTopping01("lettuce",.5);
        order01.addTopping02("tomato",.5);
        order01.addTopping03("onion",.5);
        order01.addTopping04("cheese",.25);
        order01.showOrder();

        Veggie order02 = new Veggie();
        order02.addTopping05("ketchup",.25);
        order02.addTopping06("relish",.25);
        order02.showOrder();
    }
}
