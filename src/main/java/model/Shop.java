package model;

import java.util.List;
import java.util.ArrayList;
//create class Shop using List
public class Shop {
    private final List<Item> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void printAllItems() {
        for (Item item : this.items) {
            System.out.println(item.getItemInfo());
        }
    }

    public String getItems() {
        StringBuilder returnString = new StringBuilder();

        for (Item item : this.items) {
            returnString.append(item.getItemInfo());
            returnString.append("\n");
        }

        return returnString.toString();
    }

    public void getAllItemSold() {
        System.out.println("Total Item sold information:");
        for (Item item : this.items) {
            System.out.println("Total Item Sold for " + item.getName() +" is: " + item.getItemSold());
        }
    }
}
