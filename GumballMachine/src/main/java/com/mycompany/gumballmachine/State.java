/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gumballmachine;

/**
 *
 * @author Faisal
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrack();
    public void dispense();
    public void refill();
}
