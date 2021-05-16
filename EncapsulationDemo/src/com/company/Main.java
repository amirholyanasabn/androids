package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount1 = new BankAccount();
	    bankAccount1.setCreate(10_000);
		bankAccount1.setPhoneNumber("0912300090877");
	    BankAccount bankAccount2 = new BankAccount();
	    bankAccount2.setCreate(25_000);

	    BankAccount bankAccount3 = new BankAccount();
	    bankAccount3.setCreate(12_000);

        System.out.println(bankAccount1.getCreate());
		System.out.println(bankAccount1.getPhoneNumber());
        System.out.println(bankAccount2.getCreate());
        System.out.println(bankAccount3.getCreate());



        // write your code here
//        BankAccount bankAccount1 = new BankAccount();
//        BankAccount bankAccount2 = new BankAccount();
//        BankAccount bankAccount3 = new BankAccount();

//        bankAccount1.create = 1000;
//        bankAccount2.create = 2500;
//        bankAccount3.create = 1200;
//
//        System.out.println(bankAccount1.create+" Toman");
//        System.out.println(bankAccount2.create+" Toman");
//        System.out.println(bankAccount3.create+" Toman");
    }
}
