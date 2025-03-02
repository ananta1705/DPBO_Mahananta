/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_moduls2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter three integers: ");
        for (int i = 0; i < 3; i++) numbers[i] = sc.nextInt();

        Arrays.sort(numbers);
        System.out.println("Numbers in non-decreasing order: " + Arrays.toString(numbers));

        sc.close();
    }
}

