package com.company;

public class Lion extends Animal implements Carnivore{
    @Override
    public void run() {
        System.out.println("Lion is running");
    }

    @Override
    public void eatMeat() {
        System.out.println("eat meat");
    }
}
