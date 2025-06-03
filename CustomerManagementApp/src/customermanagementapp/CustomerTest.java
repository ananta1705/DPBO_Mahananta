/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermanagementapp;

/**
 *
 * @author ASUS
 */
import customer.biz.CustomerBiz; // If CustomerBiz is in customer.biz
import customer.biz.ICustomerBiz; // If ICustomerBiz is in customer.biz
// import MissionUtil; // If MissionUtil is in default package
// import Customer; // If Customer is in default package
// If Customer and MissionUtil are in specific packages, import them accordingly.
// e.g., import customer.model.Customer;
// e.g., import customer.util.MissionUtil;

import java.util.HashMap;
import java.util.InputMismatchException;

public class CustomerTest {

    private static ICustomerBiz customerManager = new CustomerBiz(); // Using CustomerBiz concrete class

    public static void printMenu() {
        System.out.println("\n=========== << Program Manajemen Pelanggan >> ===========");
        System.out.println("1. Mendapat informasi semua pelanggan");
        System.out.println("2. Tambahkan informasi pelanggan");
        System.out.println("3. Edit usia pelanggan");
        System.out.println("4. Edit nomor telepon pelanggan");
        System.out.println("5. Hapus informasi pelanggan");
        System.out.println("9. Keluar sistem");
        System.out.println("========================================================");
    }

    public static void main(String[] args) {
        customerManager.initializeCustomer(); // Load initial data
        boolean running = true;

        while (running) {
            printMenu();
            String choiceStr = MissionUtil.getInput("## Input menu : ");
            int choice = -1;

            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("[SYSTEM] Masukkan hanya angka untuk menu.");
                continue;
            }

            switch (choice) {
                case 1:
                    customerManager.printAllCustomer();
                    break;
                case 2:
                    System.out.println("--- tambahkan informasi pelanggan baru ---");
                    String name = MissionUtil.getInput("> nama : ");
                    int age = -1;
                    while (age < 0) {
                        try {
                            age = Integer.parseInt(MissionUtil.getInput("> usia : "));
                            if (age < 0) {
                                System.out.println("[error] usia tidak bisa di input negatif.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("[error] usia harus berupa angka.");
                            age = -1; // reset to loop again
                        }
                    }
                    String hp = MissionUtil.getInput("> No telepon [HP] : ");
                    String office = MissionUtil.getInput("> No telepon [OFFICE] : ");
                    String repKey = "";
                    while (!repKey.equalsIgnoreCase("HP") && !repKey.equalsIgnoreCase("OFFICE")) {
                        repKey = MissionUtil.getInput("> No perwakilan [HP/OFFICE] : ");
                        if (!repKey.equalsIgnoreCase("HP") && !repKey.equalsIgnoreCase("OFFICE")) {
                            System.out.println("[error] Masukkan HP atau OFFICE untuk nomor perwakilan.");
                        }
                    }

                    HashMap<String, String> phones = new HashMap<>();
                    if (hp != null && !hp.trim().isEmpty()) phones.put("HP", hp);
                    if (office != null && !office.trim().isEmpty()) phones.put("OFFICE", office);
                    
                    customerManager.insertCustomer(name, age, phones, repKey.toUpperCase());
                    break;
                case 3:
                    System.out.println("--- edit usia pelanggan ---");
                    if (customerManager.getCustomerNumber() == 0) {
                        System.out.println("> informasi pelanggan tidak ada.");
                        break;
                    }
                    int custNumAge = -1;
                     try {
                        custNumAge = Integer.parseInt(MissionUtil.getInput("> No informasi pelanggan yang akan di edit : "));
                    } catch (NumberFormatException e) {
                        System.out.println("[error] Nomor pelanggan harus berupa angka.");
                        break;
                    }

                    int newAge = -1;
                    if (custNumAge > 0 && custNumAge <= customerManager.getCustomerNumber()) {
                         while (newAge < 0) {
                            try {
                                newAge = Integer.parseInt(MissionUtil.getInput("> Usia pelanggan :"));
                                // The validation for negative age is handled in CustomerBiz
                            } catch (NumberFormatException e) {
                                System.out.println("[error] usia harus berupa angka.");
                                newAge = -1; // reset to loop again
                            }
                        }
                        customerManager.changeAge(custNumAge, newAge);
                    } else {
                         System.out.println("> Tidak ada informasi pelanggan. Silahkan memasukkan nomor pelanggan yang sesuai.");
                    }
                    break;
                case 4:
                    System.out.println("--- edit No telepon pelanggan ---");
                     if (customerManager.getCustomerNumber() == 0) {
                        System.out.println("> informasi pelanggan tidak ada.");
                        break;
                    }
                    int custNumPhone = -1;
                    try {
                        custNumPhone = Integer.parseInt(MissionUtil.getInput("> Nomor pelanggan yang akan di edit : "));
                    } catch (NumberFormatException e) {
                        System.out.println("[error] Nomor pelanggan harus berupa angka.");
                        break;
                    }
                    
                    if (custNumPhone > 0 && custNumPhone <= customerManager.getCustomerNumber()) {
                        String newHp = MissionUtil.getInput("> ubah No telepon [HP] : ");
                        String newOffice = MissionUtil.getInput("> ubah No telepon [OFFICE] : ");
                        String newRepKey = "";
                        while (!newRepKey.equalsIgnoreCase("HP") && !newRepKey.equalsIgnoreCase("OFFICE")) {
                            newRepKey = MissionUtil.getInput("> ubah No perwakilan [HP/OFFICE] : ");
                             if (!newRepKey.equalsIgnoreCase("HP") && !newRepKey.equalsIgnoreCase("OFFICE")) {
                                System.out.println("[error] Masukkan HP atau OFFICE untuk nomor perwakilan.");
                            }
                        }
                        HashMap<String, String> newPhones = new HashMap<>();
                        if (newHp != null && !newHp.trim().isEmpty()) newPhones.put("HP", newHp);
                        if (newOffice != null && !newOffice.trim().isEmpty()) newPhones.put("OFFICE", newOffice);
                        
                        customerManager.changePhone(custNumPhone, newPhones, newRepKey.toUpperCase());
                    } else {
                         System.out.println("> Tidak ada informasi pelanggan. Silahkan memasukkan nomor pelanggan yang sesuai.");
                    }
                    break;
                case 5:
                    System.out.println("--- menghapus informasi pelanggan ---");
                    if (customerManager.getCustomerNumber() == 0) {
                        System.out.println("> informasi pelanggan tidak ada.");
                        break;
                    }
                    int custNumDelete = -1;
                    try {
                        custNumDelete = Integer.parseInt(MissionUtil.getInput("> Nomor pelanggan yang akan dihapus : "));
                    } catch (NumberFormatException e) {
                        System.out.println("[error] Nomor pelanggan harus berupa angka.");
                        break;
                    }
                    customerManager.deleteCustomer(custNumDelete);
                    break;
                case 9:
                    System.out.println("End. Bye-Bye~");
                    running = false;
                    MissionUtil.closeScanner(); // Close scanner on exit
                    break;
                default:
                    System.out.println("## Input menu : " + choice); // As per sample run error case
                    System.out.println("> Pilihan menu salah. Silakan coba lagi.");
                    break;
            }
        }
    }
}