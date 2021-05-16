package com.company;

public class Main {

    public static void main(String[] args) {
	Horse horse = new Horse();
	horse.run();

	Lion lion = new Lion();
	lion.run();



	//Anonymous Class
		Animal animal = new Animal(){
			@Override
			public void run() {

			}
		};
    }
}
