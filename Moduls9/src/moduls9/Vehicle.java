/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
public abstract class Vehicle {
    private String plateNumber;
    private double capacity;

    public Vehicle(String plateNumber, double capacity) {
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getCapacity() {
        return capacity;
    }

    public abstract double calculateOperationalCost();

    public void displayInfo() {
        System.out.println("Vehicle Plate: " + plateNumber +
            ", Capacity: " + capacity + " kg" +
            ", Operational Cost: " + calculateOperationalCost());
    }
}
