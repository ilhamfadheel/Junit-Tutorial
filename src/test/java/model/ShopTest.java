package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import model.Item;
import model.Shop;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    @DisplayName("Add Item into Shop")
    void addItem() {
        Item barang_1 = new Item("Sabun Mandi", 20, 100);
        Shop myShop = new Shop();
        assertEquals("",myShop.addItem(new Item(barang_1));
    }
}