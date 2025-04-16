/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.jurnal.week7.vehicletest;

import dpbo.jurnal.week7.Car;
import dpbo.jurnal.week7.Motorcycle;
import dpbo.jurnal.week7.Vehicle;

/**
 *
 * @author ASUS
 */

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2021, 4);
        car.startEngine();
        System.out.println(car.toString());

        Vehicle motorcycle = new Motorcycle("Yamaha", 2020, "Sport");
        motorcycle.startEngine();
        System.out.println(motorcycle.toString());
    }
}
