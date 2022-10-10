package com.driver;

public class Pizza {

     boolean extraCheese ;
     boolean extraToppings;
     boolean bag ;

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        extraCheese = true;
        extraToppings = true;
        bag = true;
        if(this.isVeg){
            price = 300;
            System.out.println("Base Price Of The Pizza: "+price);
        }
        else{
            price = 400;
            System.out.println("Base Price Of The Pizza: "+price);
        }
    }

    public int getPrice(){
//        System.out.println("Base Price Of The Pizza: "+price);
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese){
            price += 80;
            System.out.println("Extra Cheese Added: 80");
            extraCheese  = false;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings){
            price += 70;
            System.out.println("Extra Toppings Added: 120");
            extraToppings = false;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(bag){
            price += 20;
            System.out.println("Paperbag Added: 20");
            bag = false;
        }

    }

    public String getBill(){
        // your code goes here
        bill = "total bill: "+price;
        return this.bill;
    }
}
