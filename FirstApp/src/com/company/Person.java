package com.company;

public class Person {
    int id;
    String firstName;
    String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person(){
        //default ctor
    }

    /**
     * show welcome message
     * نمایش پیغام خوش آمد گویی
     */
    public void sayHello(){
        System.out.printf("Welcome %s %s to Java world",this.firstName,this.lastName);
    }
}
