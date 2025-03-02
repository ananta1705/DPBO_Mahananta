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
public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int apel = 0, jeruk = 0, mangga = 0;

        for (int i = 0; i < n; i++) {
            String fruit = sc.next();
            if (fruit.equals("apel")) apel++;
            else if (fruit.equals("jeruk")) jeruk++;
            else if (fruit.equals("mangga")) mangga++;
        }

        System.out.println("apel: " + apel);
        System.out.println("jeruk: " + jeruk);
        System.out.println("mangga: " + mangga);
        sc.close();
    }
}
