/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
// Ananta Puti Maharani
public class Main {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[2];

        appliances[0] = new Television(42); // Ukuran TV 42 inch misalnya
        appliances[1] = new Audio("Black");  // Warna Audio Black

        for (Appliance app : appliances) {
            app.turnOn();
            app.turnOff();
        }
    }
}
