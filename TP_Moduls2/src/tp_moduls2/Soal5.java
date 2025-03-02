/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_moduls2;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[11];

        System.out.print("Enter 11 integers: ");
        for (int i = 0; i < 11; i++) numbers[i] = sc.nextInt();

        int lastNumber = numbers[10]; // Bilangan ke-11
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > lastNumber) System.out.println(numbers[i] + " lebih besar");
            else if (numbers[i] < lastNumber) System.out.println(numbers[i] + " lebih kecil");
            else System.out.println(numbers[i] + " sama");
        }

        sc.close();
    }
}
