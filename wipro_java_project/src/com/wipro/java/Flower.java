package com.wipro.java;

/**
 * 
 */

public class Flower {
    
    // name, color, petals --> properties
    // Rose, Red, 32 --> behaviours
    // Sunflower, Yellow, 50

    // Member variables
    String flowerName; // Data type -> String
    String flowerColor; // Data type -> String
    int petalCount; // Data type -> Integer

    // Constructor
    Flower(String name, String color, int petals) {
        this.flowerName = name; 
        this.flowerColor = color;
        this.petalCount = petals;
    }

    
    void display() {
        System.out.println("Flower Name: " + flowerName + ", Color: " + flowerColor + ", Petals: " + petalCount);
    }

    public static void main(String args[]) {
        Flower flower1 = new Flower("Rose", "Red", 32);
        Flower flower2 = new Flower("Sunflower", "Yellow", 50);
        
        flower1.display();
        flower2.display();
    }
}
