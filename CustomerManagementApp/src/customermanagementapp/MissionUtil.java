/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermanagementapp;

/**
 *
 * @author ASUS
 */
// No package specified, assuming default or place in `customer.util`
import java.util.Scanner;

public class MissionUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Optional: close scanner when application exits.
    // This is tricky with static scanner, usually managed by main application lifecycle.
    public static void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }
}