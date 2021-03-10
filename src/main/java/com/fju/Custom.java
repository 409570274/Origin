package com.fju;

public class Custom {
    String id;
    int cost;
    int discount;
    int sum;

    public Custom(String id,int cost,int discount,int sum){
        this.id = id;
        this.cost = cost;
        this.discount = discount;
        this.sum = sum;
    }
    public void print(){
        System.out.println(id  + "\t"+ cost  + "   \t"+ discount + "    \t"+ sum + "\t");
    }
}


