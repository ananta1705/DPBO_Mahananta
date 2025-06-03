/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */
public class RoomType {
    protected int price;
    protected int roomSize;

    public RoomType(int price, int roomSize) {
        this.price = price;
        this.roomSize = roomSize;
    }

    public int getPrice() {
        return price;
    }

    public int getRoomSize() {
        return roomSize;
    }

    @Override
    public String toString() {
        return String.format("(%dm2/%dwon)", roomSize, price);
    }
}