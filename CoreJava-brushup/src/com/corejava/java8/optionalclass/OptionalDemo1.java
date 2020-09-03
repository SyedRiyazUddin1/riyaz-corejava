package com.corejava.java8.optionalclass;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("iPhone", 101, 40000));
        itemList.add(new Item("Redmi Mobile", 102, 45000));
        itemList.add(new Item("Oneplus-8T", 103, 51000));
        itemList.add(new Item(null, 104, 44000));


        Optional<Item> newItemList = itemList.stream()
                .filter(item->item.getItemId()>104) //Instead of null pointer exception, it will return Optional.empty
                .findFirst(); //finds the first given element in the filter
        MyLogger.consoleLogger.info("Using findFirst :"+newItemList);

        Item item = newItemList.orElseThrow(()
        -> new RuntimeException("No data exist"));
        MyLogger.consoleLogger.info(item);

//        Item item = newItemList.orElse(new Item("Vivo V15",104,50000));
//        MyLogger.consoleLogger.info(item);


    }
}


//class of an Item which has the properties name, id and price
class Item {

    String itemName;
    int itemId;
    int itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Item(String itemName, int itemId, int itemPrice) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                ", itemPrice=" + itemPrice +
                '}';
    }

}

