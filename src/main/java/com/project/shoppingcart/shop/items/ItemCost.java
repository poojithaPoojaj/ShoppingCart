package com.project.shoppingcart.shop.items;

import com.project.shoppingcart.shop.items.items.Apple;
import com.project.shoppingcart.shop.items.items.MilkPacket;
import com.project.shoppingcart.shop.items.items.Newspaper;

public class ItemCost {
 private int apple;
 private int milkPacket;
 private int newspaper;
 public ItemCost(){
     this.apple=15;
     this.milkPacket=10;
     this.newspaper=5;
 }
    public void setCost(Items item,int cost) {
        if (item.equals(Items.APPLE)) {
            Apple apple = new Apple();
            apple.setCost(cost);
            this.apple = apple.getCost();

        }
        if (item.equals(Items.MILK_PACKET)) {
            MilkPacket milkPacket = new MilkPacket();
            milkPacket.setCost(cost);
            this.milkPacket = milkPacket.getCost();

        }
        if (item.equals(Items.NEWSPAPER)) {
            Newspaper newspaper = new Newspaper();
            newspaper.setCost(cost);
            this.newspaper = newspaper.getCost();
        }

    }
    public int getApple(ItemCost itemCost){
    return itemCost.apple;
    }
    public int getMilkPacket(ItemCost itemCost){
     return itemCost.milkPacket;
    }
    public int getNewspaper(ItemCost itemCost){
     return itemCost.newspaper;
    }
}
