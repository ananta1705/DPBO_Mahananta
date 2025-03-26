/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_buku;

/**
 *
 * @author ASUS
 */

public class Customer {
    // Fields
    private String name;
    private int totalPrice;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    // Metode untuk membeli buku
    public void buyBook(Book book, int quantity) {
        this.totalPrice += book.getPrice() * quantity;
        System.out.println(name + " telah membeli " + quantity + " buku: " + book.getTitle());
    }

    // Metode untuk membeli buku bekas
    public void buyBook(SecondBook secondBook, int quantity) {
        int discountedPrice = secondBook.getPrice() - (secondBook.getPrice() * secondBook.getDiscountRate() / 100);
        this.totalPrice += discountedPrice * quantity;
        System.out.println(name + " telah membeli " + quantity + " buku bekas: " + secondBook.getTitle());
    }

    // toString untuk menampilkan informasi pelanggan
    @Override
    public String toString() {
        return "Nama Pelanggan: " + name + "\n" + 
               "Jumlah total: Rp. " + totalPrice;
    }
}
