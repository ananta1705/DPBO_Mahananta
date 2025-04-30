/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Truck("B1234CD", 10000.0, 0.2, 500),
            new Van("D5678EF", 2000.0, 10.0, 15),
            new Motorcycle("M1111XY", 150.0, 0.1, 300),
            new HeavyDutyTruck("H9999ZZ", 15000.0, 0.25, 800)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo(); // Polymorphism dan dynamic binding di sini
        }
    }
}