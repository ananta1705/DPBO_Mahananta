/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_buku;

/**
 *
 * @author ASUS
 */
// SecondBook.java
public class SecondBook extends Book {
    // Fields khusus untuk SecondBook
    private String seller;
    private int discountRate;

    // Constructor untuk SecondBook
    public SecondBook(String title, String author, int price, int stockQuantity, String seller, int discountRate) {
        super(title, author, price, stockQuantity);  // Memanggil constructor kelas induk (Book)
        this.seller = seller;
        this.discountRate = discountRate;
    }

    // Getter methods
    public String getSeller() {
        return seller;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    // Setter methods
    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    // Overriding toString untuk mencetak informasi buku bekas
    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "Penjual: " + seller + "\n" + 
               "Diskon: " + discountRate + "%";
    }
}
