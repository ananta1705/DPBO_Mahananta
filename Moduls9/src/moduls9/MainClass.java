/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls9;

/**
 *
 * @author ASUS
 */
//ananta
class Kendaraan {
    protected String namaKendaraan;

    public Kendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getInfo() {
        return "Kendaraan: " + namaKendaraan;
    }
}

// Mobil.java
class Mobil extends Kendaraan {
    public Mobil(String namaKendaraan) {
        super(namaKendaraan);
    }

    @Override
    public String getInfo() {
        return "Mobil: " + namaKendaraan;
    }
}

// Motor.java
class Motor extends Kendaraan {
    public Motor(String namaKendaraan) {
        super(namaKendaraan);
    }

    @Override
    public String getInfo() {
        return "Motor: " + namaKendaraan;
    }
}

// MainClass.java
public class MainClass {
    public static void main(String[] args) {
        Kendaraan[] kendaraanList = new Kendaraan[3];

        kendaraanList[0] = new Kendaraan("Kendaraan Umum");
        kendaraanList[1] = new Mobil("Toyota");
        kendaraanList[2] = new Motor("Yamaha");

        for (Kendaraan kd : kendaraanList) {
            System.out.println(kd.getInfo());
        }
    }
}
