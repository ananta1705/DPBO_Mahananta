/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quis1;

/**
 *
 * @author ASUS
 */
public class Truk {
class Vehicle {
    String plateNumber, type;
    double speed;

    Vehicle(String plateNumber, double speed, String type) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.type = type;
    }

    double calculateTravelTime(double distance) {
        return distance / speed;
    }

    void displayInfo(double distance) {
        System.out.printf("%s [%s] - Speed: %.1f km/h\n", type, plateNumber, speed);
        System.out.printf("Travel Time: %.2f hours\n\n", calculateTravelTime(distance));
    }
}

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


}
