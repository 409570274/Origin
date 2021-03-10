package com.fju;

      public class OrderList {
          public static void main(String[] args) {
              CustomerList[] customerLists= {
                      new CustomerList("0013",490,0,490),
                      new CustomerList("0052",1000,100,900),
                      new CustomerList("0081",290,0,290),
                      new CustomerList("2122",2000,200,1000),
              };
              for(int i = 0;i<customerLists.length;i++){
                  customerLists[i].print();
              }
          }
}
