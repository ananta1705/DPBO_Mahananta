/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
public class Truck extends Vehicle {
    private double fuelConsumption; // liter/km
    private double distance; // km

    public Truck(String plateNumber, double capacity, double fuelConsumption, double distance) {
        super(plateNumber, capacity);
        this.fuelConsumption = fuelConsumption;
        this.distance = distance;
    }

    @Override
    public double calculateOperationalCost() {
        return fuelConsumption * distance * 1.5; // 1.5 = harga per liter
    }
}







