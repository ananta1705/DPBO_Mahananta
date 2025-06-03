/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namapaketanda;

/**
 *
 * @author ASUS
 */
public class ArrayDivision {

    public static void main(String[] args) {
        int[] arrayOne = {10, 20, 13, 15};
        int[] arrayTwo = {2, 5, 0, 3};

        System.out.println("Array:");
        System.out.print("arrayOne: ");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + (i == arrayOne.length - 1 ? "" : ", "));
        }
        System.out.println();

        System.out.print("arrayTwo: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + (i == arrayTwo.length - 1 ? "" : ", "));
        }
        System.out.println();
        System.out.println(); // Baris kosong tambahan sebelum output

        System.out.println("Output:");
        // Asumsikan kedua array memiliki panjang yang sama
        // Jika tidak, perlu penanganan tambahan untuk ArrayIndexOutOfBoundsException
        // atau iterasi hingga panjang array yang lebih pendek.
        // Untuk soal ini, panjangnya sama.
        for (int i = 0; i < arrayOne.length; i++) {
            try {
                // Cek apakah arrayTwo memiliki elemen yang cukup
                if (i < arrayTwo.length) {
                    if (arrayTwo[i] == 0) {
                        // Kita bisa melempar ArithmeticException secara manual jika mau
                        // atau biarkan Java melakukannya saat operasi pembagian.
                        // throw new ArithmeticException("Pembagian dengan nol");
                    }
                    int result = arrayOne[i] / arrayTwo[i];
                    System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + result);
                } else {
                    System.out.println("Error: arrayTwo lebih pendek dari arrayOne pada indeks " + i);
                }
            } catch (ArithmeticException e) {
                // Menangkap exception jika terjadi pembagian dengan nol
                System.out.println("Terjadi error dalam kalkulasi pembagian (pembagian dengan nol)");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menangkap jika salah satu array diakses di luar batasnya (jika panjangnya beda)
                System.out.println("Error: Indeks di luar batas array.");
            }
        }
    }
}