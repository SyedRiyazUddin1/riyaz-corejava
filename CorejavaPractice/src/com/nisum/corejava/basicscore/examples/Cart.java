package com.nisum.corejava.basicscore.examples;

import java.util.ArrayList;
import java.util.List;


class Cart {

    List<Product1> cartItems = new ArrayList<Product1>();
    
    public void addProductToCartByPID(int pid) {
        Product1 product = getProductByProductID(pid);
        addToCart(product);
    }

    private Product1 getProductByProductID(int pid) {
        Product1 product = null;
        List<Product1> products = new ProList().getProducts();
        for (Product1 prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product1 product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int pid) {
        Product1 prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    void printCartItems() {
        for (Product1 prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
    
}
