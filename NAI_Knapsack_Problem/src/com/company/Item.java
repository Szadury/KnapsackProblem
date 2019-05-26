package com.company;

public class Item {
    public double value;
    public double weight;


    public double getRatio() {
        return value / weight;
    }
   public String toString(){
        return "Value: " + value + ", weight : " + weight;
    }
}
