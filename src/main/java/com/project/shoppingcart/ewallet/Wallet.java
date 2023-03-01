package com.project.shoppingcart.ewallet;


import com.beust.ah.A;
import com.project.shoppingcart.Validator;
import com.project.shoppingcart.exceptions.InvalidException;

import java.util.ArrayList;

public class  Wallet {
    ArrayList<WalletDetails> wallets;
    public Wallet(){

        wallets=new ArrayList<>();
    }
 public void createWallet (Wallet wallets,WalletDetails walletDetails){
     Validator validator=new Validator();
     if(wallets.getAllWalletUserNames(wallets).contains(walletDetails.getUserName())){
         throw new InvalidException("Already wallet exist with this userName");
     }
        if(!validator.isNameNotNullOrNotEmpty(walletDetails.getUserName()))
            throw new InvalidException("user Name Can't be null or empty");
        if(!validator.isPasswordValid(walletDetails.getPassword())){
            throw new InvalidException("Password is Invalid enter more than 4 digits as password");
        }
        if(walletDetails.getAmount()<1)
        {
            throw new InvalidException("Amount Should be more than 1 rupees to add wallet");
        }
        this.wallets.add(walletDetails);
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


    public ArrayList<String> getAllWalletUserNames(Wallet wallets){
        ArrayList<String> userNames=new ArrayList<>();
        for(WalletDetails wallet:wallets.getWallets()){
            userNames.add(wallet.getUserName());
        }
        return userNames;
    }
}
