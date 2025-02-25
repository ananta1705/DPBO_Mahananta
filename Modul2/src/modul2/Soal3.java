/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static double cToF(double c) { return c * 9 / 5 + 32; }
    public static double fToC(double f) { return (f - 32) * 5 / 9; }

    public static void main(String[] args) {
        double[] cValues = {0, 2, 98}, fValues = {20, 25, 265};
        System.out.println("Celsius  Fahrenheit | Fahrenheit  Celsius");
        for (int i = 0; i < cValues.length; i++)
            System.out.printf("%7.0f %10.1f | %10.0f %10.3f%n", 
                              cValues[i], cToF(cValues[i]), 
                              fValues[i], fToC(fValues[i]));
    }
}

