/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls8;

/**
 *
 * @author ASUS
 */
public class TravelTest {
    public static void printMenu() {
        System.out.println("\n======= < Menu > =======");
        System.out.println("1. Periksa semua produk travel");
        System.out.println("2. Periksa produk Individual");
        System.out.println("3. Permintaan produk paket travel");
        System.out.println("4. Reservasi produk travel");
        System.out.println("9. End");
    }

    public static void printHeader() {
        System.out.println("Kode\tNama\tPenerbangan\tJenis travel\tJumlah minimum orang yang boleh berangkat\tMaksimal orang yang bisa reservasi\tJumlah reservasi orang");
    }

    public static void printSeparator() {
        System.out.println("===============================================================================================");
    }

    public static void main(String[] args) {
        Travel[] travels = new Travel[10];
        travels[0] = new IndividualTravel("TRV001", "Munich", "German Airlines", "Individual Travel", 100);
        travels[1] = new IndividualTravel("TRV002", "Praha", "AirFrance", "Individual Travel", 200);
        travels[2] = new PackageTravel("TRV003", "LA", "Delta Airlines", "Paket Travel", 12);
        travels[3] = new IndividualTravel("TRV004", "Osaka", "Korean Air", "Individual Travel", 150);
        travels[4] = new PackageTravel("TRV005", "Shanghai", "Southern Airlines", "Paket Travel", 10);
        int count = 5;
        int choice;

        do {
            printMenu();
            System.out.print("\n==> Input menu: ");
            choice = DataUtil.getIntegerInput();

            if (choice == 1) {
                printHeader();
                for (int i = 0; i < count; i++) {
                    System.out.println(travels[i].toString());
                }
                printSeparator();
            } else if (choice == 2) {
                printHeader();
                for (int i = 0; i < count; i++) {
                    if (travels[i] instanceof IndividualTravel) {
                        System.out.println(travels[i].toString());
                    }
                }
                printSeparator();
            } else if (choice == 3) {
                printHeader();
                for (int i = 0; i < count; i++) {
                    if (travels[i] instanceof PackageTravel) {
                        System.out.println(travels[i].toString());
                    }
                }
                printSeparator();
            } else if (choice == 4) {
                System.out.print("Masukkan kode travel yang ingin dipesan: ");
                String inputCode = DataUtil.getStringInput();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (travels[i].getTravelCode().equalsIgnoreCase(inputCode)) {
                        System.out.print("Masukkan jumlah reservasi: ");
                        int res = DataUtil.getIntegerInput();
                        travels[i].setReserved(res);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Kode travel yang dimasukkan salah, keluarkan pesan error.");
                }
            } else if (choice != 9) {
                System.out.println("Error: Menu nomor yang tidak ada dipilih.");
            }
        } while (choice != 9);
    }
}
