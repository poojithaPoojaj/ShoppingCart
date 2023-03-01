package com.project.shoppingcart.ewallet;

public class WalletOffers {
    public int discountOnTransactionMoreThanOrEqualTo100(int amount){
          if(amount>=100){
              return (int)Math.ceil(amount*0.95);
          }
          return amount;
    }
}
