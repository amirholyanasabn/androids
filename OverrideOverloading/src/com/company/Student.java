package com.company;

public class Student extends Person {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello Student");
        super.sayHello("amir");
    }
}
