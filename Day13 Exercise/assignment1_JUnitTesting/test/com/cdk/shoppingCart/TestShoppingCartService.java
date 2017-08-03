package com.cdk.shoppingCart;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by bhirudr on 8/2/2017.
 */
public class TestShoppingCartService {
    ShoppingCartService shoppingCartService = null;

    @Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
    }

    @After
    public void clean() {
        shoppingCartService = null;
    }

    @Test
    public void testAddItem() {
        Product product1 = new Product(2, "shoes", 2000, 2);
        shoppingCartService.addItem(product1);
        Assert.assertArrayEquals("Item Should be Present in Cart after addItem", new boolean[]{true}, new boolean[]{shoppingCartService.cart.containsKey(product1.getId())});
    }


    @Test
    public void testAddItemForNumberOfItems() {
        Product product1 = new Product(2, "shoes", 2000, 2);
        Product product2 = new Product(4, "jacket", 40000, 1);
        Product product3 = new Product(7, "wallet", 300, 1);
        Product product4 = new Product(45, "helmet", 6000, 1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        shoppingCartService.addItem(product4);
        int size = shoppingCartService.cart.entrySet().size();
        Assert.assertEquals("Multiple items should be present in the cart", 4, size);
    }

    @Test
    public void testCountItems() {
        Product product1 = new Product(2, "shoes", 2000, 2);
        Product product2 = new Product(4, "jacket", 40000, 1);
        Product product3 = new Product(7, "wallet", 300, 1);
        Product product4 = new Product(45, "helmet", 6000, 1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        shoppingCartService.addItem(product4);
        int itemCount = shoppingCartService.countItems();
        Assert.assertEquals("Count Should be 5", 5, itemCount);
    }

    @Test
    public void testCountItemsForNoItems() {
        int itemCount = shoppingCartService.countItems();
        Assert.assertEquals("Count Should be 5", 0, itemCount);
    }


    @Test
    public void testRemoveItem() throws ItemNotFoundException {
        Product product1 = new Product(2, "shoes", 2000, 2);
        Product product2 = new Product(4, "jacket", 40000, 1);
        Product product3 = new Product(7, "wallet", 300, 1);
        Product product4 = new Product(45, "helmet", 6000, 1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        shoppingCartService.addItem(product4);
        shoppingCartService.removeItem(2);
        Assert.assertEquals("Cart should not contain removed element", false, shoppingCartService.cart.containsKey(2));
    }


    @Test(expected = ItemNotFoundException.class)
    public void testRemoveItemForException() throws ItemNotFoundException {
        shoppingCartService.removeItem(2);
    }


    @Test
    public void testTotalPrice() {
        Product product1 = new Product(2, "shoes", 4, 2);
        Product product2 = new Product(4, "jacket", 20, 1);
        Product product3 = new Product(7, "wallet", 10, 1);
        Product product4 = new Product(45, "helmet", 60, 1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        shoppingCartService.addItem(product4);
        double totalPrice = shoppingCartService.totalPrice();
        Assert.assertEquals("Total price should sum of all product prices", 98, (int) totalPrice);
    }

    @Test
    public void testTotalPriceForEmptyCart() {
        double totalPrice = shoppingCartService.totalPrice();
        Assert.assertEquals("Total price should be zero empty cart", 0, (int) totalPrice);
    }


}
