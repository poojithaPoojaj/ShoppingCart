package com.project.shoppingcart;

import com.project.shoppingcart.ewallet.WalletOffers;
import com.project.shoppingcart.shop.ShopOffers;
import com.project.shoppingcart.shop.items.ItemCost;
import com.project.shoppingcart.shop.items.Items;
import com.project.shoppingcart.shop.items.items.Apple;
import com.project.shoppingcart.shop.items.items.MilkPacket;
import com.project.shoppingcart.shop.items.items.Newspaper;

import java.util.HashMap;
import java.util.Map;

public class Bill {

 public int billForItems(ItemCost itemCost,ShoppingCart cart){
  int totalCost=0;
   totalCost+=getBillForApple(itemCost,cart);
   totalCost+=getBillForMilkPacket(itemCost,cart);
   totalCost+=getBillForNewspaper(itemCost,cart);
  return totalCost;
 }
 public int billForItemsWithOffers(ItemCost itemCost,ShoppingCart shoppingCart){
  int amount=this.billForItems(itemCost,shoppingCart);
   return new WalletOffers().discountOnTransactionMoreThanOrEqualTo100(amount);
 }
 public int getAllItemsWithAnyOffersOnItems(ShoppingCart shoppingCart){
   int itemsCount=0;
   itemsCount+=shoppingCart.getApples(shoppingCart);
   itemsCount+=shoppingCart.getMilkPackets(shoppingCart);
   itemsCount+=shoppingCart.getNewspapers(shoppingCart);
   return new ShopOffers().offerOnMilk(shoppingCart.getMilkPackets(shoppingCart))+itemsCount;
 }
public int getBillForApple(ItemCost itemCost,ShoppingCart shoppingCart){
  return shoppingCart.getApples(shoppingCart)*itemCost.getApple(itemCost);
}
 public int getBillForMilkPacket(ItemCost itemCost,ShoppingCart shoppingCart){
  return shoppingCart.getMilkPackets(shoppingCart)*itemCost.getMilkPacket(itemCost);
 }
 public int getBillForNewspaper(ItemCost itemCost,ShoppingCart shoppingCart){
  return shoppingCart.getNewspapers(shoppingCart)*itemCost.getNewspaper(itemCost);
 }
}
