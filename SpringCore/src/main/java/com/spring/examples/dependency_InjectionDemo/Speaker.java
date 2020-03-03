package com.spring.examples.dependency_InjectionDemo;

public class Speaker {
    public Speaker(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String brand;

    @Override
    public String toString() {
        return "Speaker{" +
                "brand='" + brand + '\'' +
                '}';
    }

}
