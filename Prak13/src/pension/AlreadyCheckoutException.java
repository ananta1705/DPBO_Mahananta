/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */

public class AlreadyCheckoutException extends Exception {
    public AlreadyCheckoutException(String message) {
        super(message);
    }
}