package com.nisum.corejava.basicscore.examples;

import java.util.ArrayList;
import java.util.List;


public class ProList {
    private final List<Product1> products = new ArrayList<Product1>();

    public ProList () {
        this.initStoreItems();
    }
    
    public List<Product1> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"Lux Soap", "Kissan Jam", "Maggie"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d};
        Integer [] stock = {10, 6, 10};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product1(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}
