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
public class Soal2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        System.out.println(sc.nextDouble() * 1.6 + " kilometers");
        sc.close();
    }
}
