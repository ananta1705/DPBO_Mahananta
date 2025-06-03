/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */


public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        // Sesuai format output: "Tamu saat ini - [Nama] CNS [no.tlp] 010-8888-0000"
        // Namun pada sample check in: "[Nama] IU [No.tlp] 010-8889-5656 check in ke kamar 101"
        // Kita gunakan format yang lebih umum untuk customer
        return String.format("Tamu saat ini - [Nama] %s [No.tlp] %s", name, phone);
    }
}