/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermanagementapp;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Assuming Customer class is accessible (e.g., in default package or imported)
// If Customer is in a package like customer.model, then:
// import customer.model.Customer;


public class CustomerBiz implements ICustomerBiz {
    private List<Customer> customerList;

    public CustomerBiz() {
        this.customerList = new ArrayList<>();
    }

    @Override
    public void initializeCustomer() {
        // Based on "Sample Data" table
        HashMap<String, String> phonesLee = new HashMap<>();
        phonesLee.put("HP", "010-5678-1234");
        phonesLee.put("OFFICE", "010-2132-9876");
        customerList.add(new Customer("Lee", 28, phonesLee, "HP"));

        HashMap<String, String> phonesPark = new HashMap<>();
        phonesPark.put("HP", "010-4567-9876");
        phonesPark.put("OFFICE", "010-1234-5678"); // Sample data image has this as office for Park
        customerList.add(new Customer("Park", 31, phonesPark, "HP"));

        HashMap<String, String> phonesChoi = new HashMap<>();
        phonesChoi.put("HP", "010-8888-9999"); // Corrected from sample image typo
        phonesChoi.put("OFFICE", "010-1111-2222");
        customerList.add(new Customer("Choi", 25, phonesChoi, "OFFICE"));

        HashMap<String, String> phonesHong = new HashMap<>();
        phonesHong.put("HP", "010-4679-8520"); // Assuming it's HP as per table, image is less clear
        phonesHong.put("OFFICE", "010-4679-8522"); // Sample data table shows 2 numbers for Hong
        customerList.add(new Customer("Hong", 27, phonesHong, "OFFICE"));
    }

    @Override
    public void printAllCustomer() {
        if (customerList.isEmpty()) {
            System.out.println("> informasi pelanggan tidak ada.");
            return;
        }
        System.out.println("--- informasi pelanggan ---");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).toString());
        }
        System.out.println("--------------------------");
    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phones, String repKey) {
        if (age < 0) {
            System.out.println("[error] usia tidak bisa di input negatif.");
            return;
        }
        customerList.add(new Customer(name, age, phones, repKey));
        System.out.println("@ Informasi pelanggan sudah ditambahkan");
    }

    @Override
    public void changeAge(int customerNumber, int age) {
        if (customerNumber <= 0 || customerNumber > customerList.size()) {
            System.out.println("> No informasi pelanggan yang akan di edit: " + customerNumber);
            System.out.println("> Tidak ada informasi pelanggan. Silahkan memasukkan nomor pelanggan yang sesuai.");
            return;
        }
        if (age < 0) {
            System.out.println("> Usia pelanggan :");
            System.out.println("[error] usia tidak bisa di input negatif.");
            return;
        }
        customerList.get(customerNumber - 1).setAge(age);
        System.out.println("@ Informasi pelanggan telah diubah.");
    }

    @Override
    public void changePhone(int customerNumber, HashMap<String, String> newPhones, String newRepKey) {
        if (customerNumber <= 0 || customerNumber > customerList.size()) {
            System.out.println("> Nomor pelanggan yang akan di edit: " + customerNumber);
            System.out.println("> Tidak ada informasi pelanggan. Silahkan memasukkan nomor pelanggan yang sesuai.");
            return;
        }
        Customer customerToUpdate = customerList.get(customerNumber - 1);
        customerToUpdate.setPhoneHashMap(newPhones);
        customerToUpdate.setRepresentativePhoneKey(newRepKey);
        System.out.println("@ Informasi pelanggan telah diubah.");
    }


    @Override
    public void deleteCustomer(int customerNumber) {
        if (customerNumber <= 0 || customerNumber > customerList.size()) {
            System.out.println("> Nomor pelanggan yang akan dihapus : " + customerNumber);
            System.out.println("> Tidak ada informasi pelanggan. Silahkan memasukkan nomor pelanggan yang sesuai.");
            return;
        }
        customerList.remove(customerNumber - 1);
        System.out.println("@ Informasi pelanggan telah dihapus");
    }

    @Override
    public int getCustomerNumber() {
        return customerList.size();
    }
}