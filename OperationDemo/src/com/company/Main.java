package com.company;

public class Main {

    public static void main(String[] args) {
        int myVar = 15;
        System.out.println(myVar > 10 ? "Pass" : "Failed");
        System.out.println(myVar % 2 == 0 ? "Even" : "Odd");
        myVar = 9;
        System.out.println(myVar > 10 ? "Success" : "Failed");
    }
}
