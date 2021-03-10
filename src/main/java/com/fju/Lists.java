package com.fju;

public class Lists {
    public static void main(String[] args) {
        Customers[] customerss = {
                new Customers("0013",490,0,490),
                new Customers("0052",1000,100,900),
                new Customers("0081",290,0,290),
                new Customers("2122",2000,200,1000),
        };
        for(int i = 0;i<customerss.length;i++){
            customerss[i].print();
        }
    }
}
