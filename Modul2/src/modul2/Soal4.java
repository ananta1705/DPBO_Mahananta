/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Ananta Puti Maharani
//103124400040
package modul2;


public class Soal4 {
    public static void main(String[] args) {
        // Array yang diberikan
        int[] numbers = {10, 21, 33, 42, 51, 64, 79, 80};

        // Menampilkan bilangan ganjil dan menghitung jumlahnya
        int totalOdd = 0;
        System.out.print("Bilangan ganjil: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                totalOdd += num;
            }
        }

        // Menampilkan jumlah bilangan ganjil
        System.out.println("\nJumlah bilangan ganjil adalah " + totalOdd + ".");
    }
}
