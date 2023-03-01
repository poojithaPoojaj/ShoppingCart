package com.project.shoppingcart.ewallet;


import com.project.shoppingcart.exceptions.InvalidException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class WalletTest {


    @Test
    public void userShouldBeAbleToCreateWallet(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("Poojitha",12345,5000));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
        Assert.assertEquals(1,wallets.size());
        Assert.assertEquals("Poojitha",wallets.get(0).getUserName());
        Assert.assertEquals(12345,wallets.get(0).getPassword());
        Assert.assertEquals(5000,wallets.get(0).getAmount());
    }
    @Test(expectedExceptions = InvalidException.class)
    public void userShouldNotAbleToCreateNullAsUserNameForWallet(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails(null,12345,5000));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
    }
    @Test(expectedExceptions = InvalidException.class)
    public void userShouldNotAbleToCreateWalletWithUserNameAsEmpty(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("",12345,4000));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
    }
    @Test(expectedExceptions = InvalidException.class)
    public void userShouldNotAbleToCreateWalletWithExistingUserName(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("A",12345,4000));
        wallet.createWallet(wallet,new WalletDetails("A",65389,2423));
    }
    @Test
    public void userShouldAbleToCreatePasswordMoreThanFourAndLessThan8Digits(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("Poojitha",12345,5000));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
        Assert.assertEquals(1,wallets.size());
    }
    @Test(expectedExceptions = InvalidException.class)
    public void userShouldNotAbleToCreatePasswordLessThanFourDigits(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("Poojitha",125,5000));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
    }
    @Test(expectedExceptions = InvalidException.class)
    public void userShouldNotAbleToCreateWalletWithZeroAmount(){
        Wallet wallet=new Wallet();
        wallet.createWallet(wallet,new WalletDetails("pooja",1234,0));
        ArrayList<WalletDetails> wallets=wallet.getWallets();
    }

}