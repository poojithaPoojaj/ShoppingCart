package com.project.shoppingcart.ewallet;


import com.project.shoppingcart.exceptions.InvalidException;

import java.util.ArrayList;

public class  Wallet {
    ArrayList<WalletDetails> wallets;
    public Wallet(){
        wallets=new ArrayList<>();
    }
 public void createWallet (String userName,int password,int amount){
  wallets.add(new WalletDetails(userName, password,amount));
 }
 public void pay(Wallet wallets,String userName,int password,int amount){
        for(WalletDetails walletDetails:wallets.getWallets()){
            if(walletDetails.getUserName().equalsIgnoreCase(userName)){
                if(walletDetails.getPassword()==password ){
                    if(walletDetails.getAmount()>=amount) {
                        walletDetails.setAmount(walletDetails.getAmount() - amount);
                        return;
                    }
                    throw new InvalidException("The Required Amount is Not Available in Wallet");
                }
                throw new InvalidException("The Password is Invalid");
            }
        }
        throw new InvalidException("The UserName is Invalid");

 }

    public ArrayList<WalletDetails> getWallets() {
        return wallets;
    }
}
