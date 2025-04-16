/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.jurnal.week7;

/**
 *
 * @author ASUS
 */

abstract class Account {
    String number;
    String name;
    int balance;

  
    Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    
    
    public String getNumber() {
        return number;
    }

   
    public String getName() {
        return name;
    }

    // Getter untuk saldo
    public int getBalance() {
        return balance;
    }

   
    public void openAccount() {
        System.out.println("Akun dengan nomor " + number + " telah dibuka.");
    }
}


class FundAccount extends Account {
    double earningRate;

    FundAccount(String number, String name, int balance, double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

   
    public double getEarningRate() {
        return earningRate;
    }

    
    public double earnMoney() {
        return balance * (earningRate / 100);
    }
}

public class Main {
    public static void main(String[] args) {
       
        FundAccount fundAccount = new FundAccount("III-2222", "Ariq Herlitsa", 5000000, 4.7);


        System.out.println("Buka Akun:");
        System.out.println("Nomor rekening: " + fundAccount.getNumber());
        System.out.println("Pemilik akun: " + fundAccount.getName());
        System.out.println("Saldo: Rp. " + fundAccount.getBalance());
        System.out.println("Tingkat pengembalian: " + fundAccount.getEarningRate() + "%");
        System.out.println("Keuntungan telah diperoleh: Rp. " + fundAccount.earnMoney());
    }
}

