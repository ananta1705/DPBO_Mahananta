/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Book
        List<Book> bookList = new ArrayList<>();

        // Menambahkan data buku ke ArrayList
        bookList.add(new Book("Rules of Java", 346, 15000));
        bookList.add(new Book("Oracle 11g", 560, 18000));
        bookList.add(new Book("Copying JSP", 271, 12000));

        // Menampilkan data setiap buku sesuai format "Hasil Run"
        System.out.println("Hasil Run:");
        int nomor = 1;
        for (Book buku : bookList) {
            System.out.println(nomor + ". " + buku.toString());
            nomor++;
        }
    }
}