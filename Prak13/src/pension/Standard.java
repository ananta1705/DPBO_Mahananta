/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */


public class Standard extends RoomType {
    public Standard() {
        super(80000, 14); // Harga 80000, ukuran 14m2
    }

    @Override
    public String toString() {
        return "Standar room " + super.toString();
    }
}