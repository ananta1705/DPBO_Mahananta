/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_buku;

/**
 *
 * @author ASUS
 */

public class Book {
    // Fields
    private String title;
    private String author;
    private int price;
    private int stockQuantity;

    public Book(String title, String author, int price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

   
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    
    @Override
    public String toString() {
        return "Judul: " + title + "\n" +
               "Penulis: " + author + "\n" +
               "Harga: Rp. " + price + ",-" + "\n" +
               "Persediaan: " + stockQuantity + " Jilid";
    }
}
