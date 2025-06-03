/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermanagementapp;

/**
 *
 * @author ASUS
 */

import java.util.HashMap;

// As per Class Diagram and instructions
public interface ICustomerBiz {
    void initializeCustomer();
    void printAllCustomer();
    void insertCustomer(String name, int age, HashMap<String, String> phones, String repKey);
    void changeAge(int customerNumber, int age);
    // The sample run for "Edit nomor telepon pelanggan" implies changing all phones and representative for a customer
    void changePhone(int customerNumber, HashMap<String, String> newPhones, String newRepKey);
    void deleteCustomer(int customerNumber);
    int getCustomerNumber(); // Returns total number of customers
}