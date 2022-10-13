package com.driver;

public class Pizza {

     boolean extraCheese ;
     boolean extraToppings;
     boolean bag ;

    private int price;
    private Boolean isVeg;
    private String bill ;
    private boolean getBill;
    private int extratopping;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheese = true;
        this.extraToppings = true;
        this.bag = true;
        this.bill = "";
         this.getBill = true;
        if(this.isVeg){
//            System.out.println("are you running");
            this.price = 300;

        }
        else{
            this.price = 400;

//            System.out.println("are you not running");
        }
    }

    public int getPrice(){
//        System.out.println("Base Price Of The Pizza: "+price);
//        System.out.println("get price is working");
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese){
            price += 80;
            extraCheese  = false;
//            System.out.println("extra cheese is added");
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings){
            if(isVeg){
                 price += 70;
                 extratopping = 70;
            }
            
            else{ price += 120;
                 extratopping = 120;
                }
//            System.out.println("extra topping added");
            extraToppings = false;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(bag){
            price += 20;
//            System.out.println("Carray bag added");
            bag = false;
        }

    }

    public String getBill(){
        // your code goes here
//        System.out.println("now billl is:"+bill);
        if(getBill){
        if(isVeg) bill += "Base Price Of The Pizza: "+"300"+"\n";
        if(!isVeg)  bill+= "Base Price Of The Pizza: "+"400"+"\n";
        if(!extraCheese)  bill += "Extra Cheese Added: 80"+"\n";
        if(!extraToppings) bill += "Extra Toppings Added: "extratopping+"\n";
        if(!bag) bill += "Paperbag Added: 20"+"\n";
        if(this.getBill)bill += "Total Price: "+price;
             getBill = false;
        }
        return this.bill;
    }
}
