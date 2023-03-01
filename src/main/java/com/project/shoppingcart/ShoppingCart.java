package com.project.shoppingcart;

import com.project.shoppingcart.shop.items.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    public HashMap<Items,Integer> cart;
    public ShoppingCart(){
        cart=new HashMap<>();
    }
    public void add(Items item){
        if(cart.containsKey(item)){
            cart.put(item,cart.get(item)+1);
        }
        else{
            cart.put(item,1);
        }

    }
    public HashMap<Items,Integer> getItems(ShoppingCart shoppingCart) {
        return shoppingCart.cart;
    }
    public int getTotalItems(ShoppingCart shoppingCart){
        int totalItems=0;
        for(Map.Entry<Items,Integer> item:shoppingCart.getItems(shoppingCart).entrySet() ){
            totalItems+=item.getValue();
        }
        return totalItems;
    }
 public int getApples(ShoppingCart cart){
        return getItems(cart).get(Items.APPLE);
 }
    public int getMilkPackets(ShoppingCart cart){
        return getItems(cart).get(Items.MILK_PACKET);
    }
    public int getNewspapers(ShoppingCart cart){
        return getItems(cart).get(Items.NEWSPAPER);
    }
}
