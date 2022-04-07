package com.mycompany.lab06;

public abstract class BaseLogger {
    private String level;
    String label = "Unknown l";

    public abstract String getLevel();

    public String getLabel() {
        return label;
    }   
}
