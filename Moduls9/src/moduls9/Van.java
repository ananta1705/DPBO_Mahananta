/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
public class Van extends Vehicle {
    private double hourlyRate; // tarif per jam
    private int hoursUsed; // jam penggunaan

    public Van(String plateNumber, double capacity, double hourlyRate, int hoursUsed) {
        super(plateNumber, capacity);
        this.hourlyRate = hourlyRate;
        this.hoursUsed = hoursUsed;
    }

    @Override
    public double calculateOperationalCost() {
        return hourlyRate * hoursUsed;
    }
}