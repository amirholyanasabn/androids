package com.company;

public class BankAccount {
    //Rial
    private long create;
    private String phoneNumber;
   public String getCreate(){
       return this.create+ " Rial";
   }

    public void setCreate(long create) {
        this.create = create;
    }

    public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
       return phoneNumber; //this.phoneNumber
    }
}
