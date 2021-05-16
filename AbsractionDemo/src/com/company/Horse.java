package com.company;

public class Horse extends Animal implements Vegetarian{
    @Override
    public void run() {
        System.out.println("Horse is running");
    }


    @Override
    public void eatVegetable() {
        System.out.println("eat vegetable");
    }
}
