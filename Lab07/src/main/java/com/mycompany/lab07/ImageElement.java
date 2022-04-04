package com.mycompany.lab07;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import javax.swing.ImageIcon;

public class ImageElement {

    private String name;
    public ImageElement(String name) {
        this.name = name;
    }

    public String myPosition(int position) {
        return "" + position + " " + this.name + ": " + this;
    }

    public ImageIcon getImageElement() {
        try {
            return new ImageIcon(("C:\\Users\\Faisal\\Documents\\NetBeansProjects\\CPIT252\\Lab07\\src\\main\\java\\com\\mycompany\\lab07\\images\\" + this.name).toString());
        }
        catch(InvalidPathException e){
            System.out.println("Invalid Path");
        }
        return null;
    }
}
