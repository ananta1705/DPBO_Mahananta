/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author ASUS
 */
public class Book {
    private String judulBuku;
    private int jumlahHalaman;
    private int harga;

    // Constructor
    public Book(String judulBuku, int jumlahHalaman, int harga) {
        this.judulBuku = judulBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    // Getter methods (opsional untuk soal ini, tapi praktik yang baik)
    public String getJudulBuku() {
        return judulBuku;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public int getHarga() {
        return harga;
    }

    // Override toString() untuk format output yang diinginkan
    @Override
    public String toString() {
        return judulBuku + " (" + jumlahHalaman + " page): " + harga + " won";
    }
}