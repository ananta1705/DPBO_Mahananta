/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */
public class Suite extends RoomType {
    public Suite() {
        super(260000, 30); // Harga 260000, ukuran 30m2
    }

    @Override
    public String toString() {
        return "Suite room " + super.toString();
    }
}