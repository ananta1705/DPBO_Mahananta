/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author ASUS
 */
// Kelas Product untuk menyimpan informasi produk
class Product {
    String namaProduk;
    double harga;
    int stok;

    // Konstruktor untuk menginisialisasi produk dengan nama, harga, dan stok
    Product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi produk
    void displayProductInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("----------------------------");
    }
}

// Kelas ProductManager untuk mengelola produk
class ProductManager {
    // Method untuk menampilkan informasi produk
    void tampilkanInformasiProduk(Product produk) {
        produk.displayProductInfo(); // Menampilkan informasi produk
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek produk dengan informasi nama, harga, dan stok
        Product produk1 = new Product("Laptop", 5000000, 10);
        Product produk2 = new Product("Mouse", 50000, 50);
        Product produk3 = new Product("Keyboard", 150000, 30);

        // Membuat objek ProductManager untuk menampilkan informasi produk
        ProductManager manager = new ProductManager();

        // Menampilkan informasi produk
        System.out.println("***** Informasi Produk *****");
        manager.tampilkanInformasiProduk(produk1);
        manager.tampilkanInformasiProduk(produk2);
        manager.tampilkanInformasiProduk(produk3);
        System.out.println("-----------------------------------");
    }
}
