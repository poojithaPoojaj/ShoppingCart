package com.project.shoppingcart;


import com.project.shoppingcart.shop.items.ItemCost;
import com.project.shoppingcart.shop.items.Items;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillTest {
//set cost and check total cost
    //set cost and check cost with shop offers
    //set codt and check cost with wallet cose
    @Test
    public void setCostAndCheckTotalCost(){
        ItemCost itemCost=new ItemCost();
        itemCost.setCost(Items.APPLE,15);
        itemCost.setCost(Items.MILK_PACKET,10);
        itemCost.setCost(Items.NEWSPAPER,5);


        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.MILK_PACKET);
        shoppingCart.add(Items.NEWSPAPER);
        shoppingCart.add(Items.NEWSPAPER);
        Bill bill=new Bill();
        Assert.assertEquals(50,bill.billForItems(itemCost,shoppingCart));
    }
    @Test
    public void setCostAndCheckIndividualItemCost(){
        ItemCost itemCost=new ItemCost();
        itemCost.setCost(Items.APPLE,15);
        itemCost.setCost(Items.MILK_PACKET,10);
        itemCost.setCost(Items.NEWSPAPER,5);

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.MILK_PACKET);
        shoppingCart.add(Items.NEWSPAPER);
        shoppingCart.add(Items.NEWSPAPER);
        Bill bill=new Bill();

        Assert.assertEquals(30,bill.getBillForApple(itemCost,shoppingCart));
        Assert.assertEquals(10,bill.getBillForMilkPacket(itemCost,shoppingCart));
        Assert.assertEquals(10,bill.getBillForNewspaper(itemCost,shoppingCart));
    }
    @Test
    public void setCostAndCheckBillWithAnyDiscounts(){
        ItemCost itemCost=new ItemCost();
        itemCost.setCost(Items.APPLE,50);
        itemCost.setCost(Items.MILK_PACKET,10);
        itemCost.setCost(Items.NEWSPAPER,5);

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.MILK_PACKET);
        shoppingCart.add(Items.NEWSPAPER);
        shoppingCart.add(Items.NEWSPAPER);
        Bill bill=new Bill();

        Assert.assertEquals(114,bill.billForItemsWithOffers(itemCost,shoppingCart));
    }
    @Test
    public void calculateTotalItemsWilComeWithOffersOnItems(){
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.APPLE);
        shoppingCart.add(Items.MILK_PACKET);
        shoppingCart.add(Items.MILK_PACKET);
        shoppingCart.add(Items.NEWSPAPER);
        shoppingCart.add(Items.NEWSPAPER);
        Bill bill=new Bill();

        Assert.assertEquals(7,bill.getAllItemsWithAnyOffersOnItems(shoppingCart));
    }

}