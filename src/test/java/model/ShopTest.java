package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import model.Item;
import model.Shop;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    @DisplayName("Add Item into Shop")
    void getItems() {
        Item barang1 = new Item("Sabun Mandi", 20, 100);
        Shop myShop = new Shop();
        myShop.addItem(barang1);
        String result = "Item name: 'Sabun Mandi', Point: 20, Stock Available: 100, Item Sold:  0";
        assertEquals(result,myShop.getItems());
    }
}