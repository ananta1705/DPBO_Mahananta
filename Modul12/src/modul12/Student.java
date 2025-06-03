/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author ASUS
 */
public class Student {
    private String nim;
    private String namaMurid;
    private int nilaiBIndonesia;
    private int nilaiBInggris;
    private int nilaiMatematika;

    // Constructor
    public Student(String nim, String namaMurid, int nilaiBIndonesia, int nilaiBInggris, int nilaiMatematika) {
        this.nim = nim;
        this.namaMurid = namaMurid;
        this.nilaiBIndonesia = nilaiBIndonesia;
        this.nilaiBInggris = nilaiBInggris;
        this.nilaiMatematika = nilaiMatematika;
    }

    // Getter methods (opsional untuk soal ini, tapi praktik yang baik)
    public String getNim() {
        return nim;
    }

    public String getNamaMurid() {
        return namaMurid;
    }

    public int getNilaiBIndonesia() {
        return nilaiBIndonesia;
    }

    public int getNilaiBInggris() {
        return nilaiBInggris;
    }

    public int getNilaiMatematika() {
        return nilaiMatematika;
    }

    // Override toString() untuk format output yang diinginkan
    @Override
    public String toString() {
        return nim + " - " + namaMurid + " (Bahasa Indonesia: " + nilaiBIndonesia +
               ", Bahasa Inggris: " + nilaiBInggris + ", Matematika: " + nilaiMatematika + " )";
    }
}