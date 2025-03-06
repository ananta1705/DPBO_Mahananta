/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quis1;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        double distance = 200;
        Vehicle[] vehicles = {
            new Vehicle("B 1234 XY", 80, "Truck"),
            new Vehicle("D 5678 AB", 100, "Car"),
            new Vehicle("F 9101 CD", 60, "Motorcycle")
        };

        System.out.printf("Travel Distance: %.1f km\n\n", distance);
        for (Vehicle v : vehicles) {
            v.displayInfo(distance);
        }
    }
}
