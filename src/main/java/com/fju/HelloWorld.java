package com.fju;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //int[] scores = {50 ,80 ,35 ,90};
        //int[] ss= new int[5];
        Student[] students = {
                new Student("1101","Evae",50,90),
                new Student("1102","Jack",60,80),
                new Student("1103","Mike",70,70),
                new Student("1104","Kane",80,60),
        };
        for(int i = 0;i< students.length;i++){
            students[i].print();
        }
    }
}
