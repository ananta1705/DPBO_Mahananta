/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 * 
 *
 * @author ASUS
 */
public class PlayMain {
 public static void main(String[] args) {
        Truck truck = new Truck("B1234XYZ", 8000, 0.25, 300);
        Van van = new Van("D5678ABC", 1500, 20.0, 5);

        truck.displayInfo();
        van.displayInfo();
    }
}