package com.project.shoppingcart.ewallet;

public class WalletDetails {
 private String userName;
 private int password;
 private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }

    public int getAmount() {
        return amount;
    }

    public WalletDetails(String userName, int password, int amount){
    this.userName=userName;
    this.password=password;
    this.amount=amount;
}
public WalletDetails(){

}
    public WalletDetails create(String userName,int password,int amount){
        return new WalletDetails(userName,password,amount);
    }
}
