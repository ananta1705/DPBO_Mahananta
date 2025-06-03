/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pension;

/**
 *
 * @author ASUS
 */


import java.util.InputMismatchException;
import java.util.Scanner;
import pesion.biz.PensionBiz;
import pesion.biz.PensionBiz;

public class PesionTest {

    private static Scanner scanner = new Scanner(System.in);
    private static PensionBiz pensionManager = new pensionBiz(); // Inisialisasi di sini

    public static void printHeader() {
        System.out.println("\n======= Manajemen Sistem Pension Chun =======");
    }

    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        // initializeRoomData() sudah dipanggil di constructor PensionBiz
        // pensionManager.initializeRoomData(); 

        boolean running = true;
        while (running) {
            printHeader();
            System.out.println("1. Periksa seluruh ruangan");
            System.out.println("2. check in");
            System.out.println("3. check out");
            System.out.println("0. Selesai");
            System.out.print("# Input Menu >> ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[Error] Silahkan input menu kembali (angka).");
                continue;
            }

            System.out.println("=========================================");

            switch (choice) {
                case 1:
                    pensionManager.roomList();
                    break;
                case 2:
                    handleCheckIn();
                    break;
                case 3:
                    handleCheckOut();
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih! Program Selesai.");
                    break;
                default:
                    System.out.println("[Error] Pilihan menu tidak valid.");
            }
        }
        scanner.close();
    }

    private static void handleCheckIn() {
        System.out.print("Silahkan input nomor kamar yang akan ditempati >> ");
        String roomId = scanner.nextLine();
        // Validasi apakah roomId adalah angka bisa ditambahkan di sini jika diperlukan
        // sebelum memanggil pensionManager.checkIn. Namun, findRoomById sudah menangani
        // kasus jika roomID tidak valid (tidak ditemukan).

        System.out.print("Silahkan input nama anda >> ");
        String custName = scanner.nextLine();
        System.out.print("Silahkan masukan no.tlp anda >> ");
        String custPhone = scanner.nextLine();

        try {
            String result = pensionManager.checkIn(roomId, custName, custPhone);
            System.out.println(result);
        } catch (AlreadyReservedException e) {
            System.out.println("[Error] " + e.getMessage());
        } catch (Exception e) { // Tangkap exception umum lainnya
            System.out.println("[Error] Terjadi kesalahan saat check-in: " + e.getMessage());
        }
    }

    private static void handleCheckOut() {
        System.out.print("Masukkan nomor kamar anda >> ");
        String roomId = scanner.nextLine();

        try {
            String result = pensionManager.checkOut(roomId);
            System.out.println(result);
        } catch (AlreadyCheckoutException e) {
            System.out.println("[Error] " + e.getMessage());
        } catch (Exception e) { // Tangkap exception umum lainnya
            System.out.println("[Error] Terjadi kesalahan saat check-out: " + e.getMessage());
        }
    }
}