/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_buku;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek Book
        Book book1 = new Book("Apa itu Keadilan?", "Michael Sandel", 15000, 15);
        Book book2 = new Book("Sejarah Indonesia", "Ir. Soekarno", 25000, 10);

        // Membuat objek SecondBook
        SecondBook secondBook1 = new SecondBook("Sistem Ekonomi Dunia", "Adam Smith", 30000, 5, "BukuToko", 20);
        SecondBook secondBook2 = new SecondBook("Pemrograman Java", "James Gosling", 50000, 8, "TokoBekas", 10);

        // Membuat objek Customer
        Customer customer1 = new Customer("Naila");
        Customer customer2 = new Customer("Budi");

        // Pelanggan membeli buku baru
        customer1.buyBook(book1, 2); // Naila membeli 2 buku baru "Apa itu Keadilan?"
        customer2.buyBook(book2, 1); // Budi membeli 1 buku baru "Sejarah Indonesia"

        // Pelanggan membeli buku bekas
        customer1.buyBook(secondBook1, 1); // Naila membeli 1 buku bekas "Sistem Ekonomi Dunia"
        customer2.buyBook(secondBook2, 3); // Budi membeli 3 buku bekas "Pemrograman Java"

        // Menampilkan informasi pelanggan
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
