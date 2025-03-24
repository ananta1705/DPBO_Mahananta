/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author ASUS
 */


class Publication {
    // Atribut buku
    String title;
    int price;
    int pageCount;

    // Konstruktor untuk menginisialisasi atribut buku
    Publication(String title, int price, int pageCount) {
        this.title = title;
        this.price = price;
        this.pageCount = pageCount;
    }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        // Format harga dalam format mata uang Indonesia
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String formattedPrice = currencyFormat.format(price);

        // Menampilkan informasi buku
        System.out.println(title + " (Price List: " + formattedPrice + ")");
        System.out.println(title + " - Pembelian Jilid: " + pageCount);
    }
}

public class pp {
    public static void main(String[] args) {
        // Membuat objek buku dengan informasi nama buku, harga, dan jumlah halaman
        Publication book1 = new Publication("Three Kingdom", 5000, 67);
        Publication book2 = new Publication("A Pie", 8400, 82);

        // Menampilkan informasi buku
        System.out.println("***** Mencari Informasi Buku *****");
        book1.displayInfo();
        book2.displayInfo();
        System.out.println("-----------------------------------");
    }
}
