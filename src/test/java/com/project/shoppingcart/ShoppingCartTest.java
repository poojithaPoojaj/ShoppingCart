package com.project.shoppingcart;

import com.project.shoppingcart.shop.items.Items;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;



public class ShoppingCartTest {

@Test
public void addItemsCheckTotalOfAllItems(){
 ShoppingCart shoppingCart=new ShoppingCart();
 shoppingCart.add(Items.APPLE);
 shoppingCart.add(Items.APPLE);
 shoppingCart.add(Items.MILK_PACKET);
 shoppingCart.add(Items.NEWSPAPER);
 shoppingCart.add(Items.NEWSPAPER);

 Assert.assertEquals(5,shoppingCart.getTotalItems(shoppingCart));
}
@Test
 public void addItemsAndCheckTotalOfIndividualItems(){
  ShoppingCart shoppingCart=new ShoppingCart();
  shoppingCart.add(Items.APPLE);
  shoppingCart.add(Items.APPLE);
  shoppingCart.add(Items.MILK_PACKET);
  shoppingCart.add(Items.NEWSPAPER);
  shoppingCart.add(Items.NEWSPAPER);
  Assert.assertEquals(2,shoppingCart.getApples(shoppingCart));
  Assert.assertEquals(1,shoppingCart.getMilkPackets(shoppingCart));
  Assert.assertEquals(2,shoppingCart.getNewspapers(shoppingCart));
 }
}