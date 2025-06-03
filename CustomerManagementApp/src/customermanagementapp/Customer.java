/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermanagementapp;

/**
 *
 * @author ASUS
 */
// No package specified, so default package or place it where appropriate (e.g., customer.model)
// For simplicity with the instructions, let's assume default or same package as CustomerTest if not specified.
// However, a common practice would be `customer.model.Customer`

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private int age;
    // phoneHashMap: Key "HP" or "OFFICE", Value the phone number
    private HashMap<String, String> phoneHashMap;
    // representativePhoneKey: Stores either "HP" or "OFFICE" to indicate the main contact
    private String representativePhoneKey;

    public Customer(String name, int age, HashMap<String, String> phoneHashMap, String representativePhoneKey) {
        this.name = name;
        this.age = age;
        this.phoneHashMap = phoneHashMap;
        this.representativePhoneKey = representativePhoneKey;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashMap<String, String> getPhoneHashMap() {
        return phoneHashMap;
    }

    public String getRepresentativePhoneKey() {
        return representativePhoneKey;
    }

    public String getRepresentativePhoneNumber() {
        if (representativePhoneKey != null && phoneHashMap.containsKey(representativePhoneKey)) {
            return phoneHashMap.get(representativePhoneKey);
        }
        return "N/A"; // Or some other default
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneHashMap(HashMap<String, String> phoneHashMap) {
        this.phoneHashMap = phoneHashMap;
    }

    public void setRepresentativePhoneKey(String representativePhoneKey) {
        this.representativePhoneKey = representativePhoneKey;
    }

    // To assist in printing information as per Sample Run
    public String getFormattedPhones() {
        StringBuilder sb = new StringBuilder();
        if (phoneHashMap.containsKey("HP")) {
            sb.append("[HP] ").append(phoneHashMap.get("HP")).append(" ");
        }
        if (phoneHashMap.containsKey("OFFICE")) {
            sb.append("[OFFICE] ").append(phoneHashMap.get("OFFICE"));
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return "nama : " + name + " usia : " + age +
               " No telepon : " + getFormattedPhones() +
               " No perwakilan : [" + representativePhoneKey + "]" + getRepresentativePhoneNumber();
    }
}