/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import java.util.List;
public class Lab02 {

    public static void main(String[] args) {

    }

}

class Car {
    String make;
    String model;
    int year;
    List<Recall> recall;

    public Car(String make, String model, int year, List<Recall> recall) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.recall = fetchRecalls();
    }

    private List<Recall> fetchRecalls() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}

public class Recall {
    private static int count;
    private static String message;
    private String manufacturer;
    private boolean parkIt;
    private boolean parkOutSide;
    private String nhtsaActionNumber;
    private String component;
    private String consequence;
    private String nhtsaCampaignNumber;
    private String notes;
    private String remedy;
    private Date reportReceivedDate;
    private String summary;

}


