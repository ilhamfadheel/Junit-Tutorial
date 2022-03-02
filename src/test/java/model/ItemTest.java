package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    @DisplayName("Change an Item name")
    void setNameTest() {
        Item item1 = new Item("Item 1", 100, 35);

        item1.setName("Updated Item 1");
        assertEquals("Updated Item 1", item1.getName());
    }

}