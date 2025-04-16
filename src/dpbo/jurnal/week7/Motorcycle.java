/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.jurnal.week7;

/**
 *
 * @author ASUS
 */
public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, int year, String type) {
        super(brand, year); 
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with key.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}

