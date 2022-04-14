package com.mycompany.payment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faisal
 */
public class Product {
    private String sku;
    private String name;
    private double price;

    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\tSKU: " + sku + "\t price: $" + price;
    }
    
    
}
