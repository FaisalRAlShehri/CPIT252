/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.payment;

import java.util.Scanner;

/**
 *
 * @author Faisal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        Product product1 = new Product("Body Wash", "1468463", 10.99);
        Product product2 = new Product("Shampoo", "1567468", 14.99);
        
        cart.addItem(product1);
        cart.addItem(product2);
        
        System.out.println("Shopping cart:\n" + cart.toString());
        System.out.println("Total: $" + cart.calculateTotal());
        System.out.println("\nSelect payment method:\n1. Credit Card\n2. Paypal\n");
        
        Scanner scanner = new Scanner(System.in);
        
        int paymentMethod = scanner.nextInt();
        if (paymentMethod == 1) {
            cart.pay(new CreditCardPayment("Faisal AlShehri", "1846335418643185", "513", "09/24"));
        } else if(paymentMethod == 2){
            cart.pay(new PayPalPayment("email@email.com", "fais.dev"));
        }
    }
    
}
