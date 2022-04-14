/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment;

/**
 *
 * @author Faisal
 */
public class PayPalPayment implements Payment{
    private String email;
    private String url;

    public PayPalPayment(String email, String url) {
        this.email = email;
        this.url = url;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Paypal.");
    }
    
    
}
