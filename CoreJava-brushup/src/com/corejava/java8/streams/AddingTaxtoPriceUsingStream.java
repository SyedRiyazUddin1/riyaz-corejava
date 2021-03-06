package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Product4 {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Product4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products List [name=" + name + ", price=" + price + "]";
    }
}

public class AddingTaxtoPriceUsingStream {

    public static void main(String[] args) {


        List<Product4> productList = new ArrayList<Product4>();
        productList.add(new Product4("Redmi Mobile", 30000));
        productList.add(new Product4("iPhone", 60000));
        productList.add(new Product4("Samsung Note10", 40000));
        productList.add(new Product4("OnePlus 6T", 38000));

        MyLogger.consoleLogger.info(productList);

        // adding 12% tax to the price
        List<Product4> newList = productList.stream().map(product -> {
            double tax = product.getPrice() * 12 / 100;
            product.setPrice(product.getPrice() + tax);
            return product;
        }).collect(Collectors.toList());

        MyLogger.consoleLogger.info("Added 12% tax to the prices " + newList);

        // adding 500 to all the price
        List<Product4> newList1 = productList.stream().map(product -> {
            product.setPrice(product.getPrice() + 500);
            return product;
        }).collect(Collectors.toList());

        MyLogger.consoleLogger.info("Added 500 to the prices :" + newList1);

        // changing each product name to UPPERCASE
        List<Product4> newList2 = productList.stream().map(product -> {
            product.setName(product.getName().toUpperCase());
            return product;
        }).collect(Collectors.toList());

        MyLogger.consoleLogger.info("UpperCased each product name :" + newList2);


    }

}
