/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
abstract class Account {
    String number, name;
    int balance;

    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public abstract void openAccount();
}


class FundAccount extends Account {
    double earningRate;

    public FundAccount(String number, String name, int balance, double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

    public void openAccount() {
        System.out.println("Buka akun.");
        System.out.println("Nomor rekening: " + number);
        System.out.println("Pemilik akun: " + name);
        System.out.println("Saldo: " + balance + " Rupiah");
        System.out.println("Tingkat pengembalian: " + earningRate + "%");
        System.out.println("Keuntungan: " + balance * earningRate / 100 + " Rupiah");
    }
}

public class Soal5 {
    public static void main(String[] args) {
        FundAccount account = new FundAccount("111-2222", "Andi", 50000000, 4.7);
        account.openAccount();  // Menampilkan seluruh informasi akun
    }
}
