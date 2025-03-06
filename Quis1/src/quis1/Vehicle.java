package quis1;

/**
 *
 * @author ASUS
 */
public class Vehicle {
    String plateNumber, vehicleType;
    double speed;

    // Konstruktor untuk kelas Vehicle
    Vehicle(String plateNumber, double speed, String vehicleType) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.vehicleType = vehicleType;
    }

    // Metode untuk menghitung waktu perjalanan berdasarkan jarak dan kecepatan
    double calculateTravelTime(double distance) {
        return distance / speed;
    }
    
    // Metode untuk menampilkan informasi kendaraan
    void displayInfo(double distance) {
        System.out.printf("%s [%s] - Kecepatan: %.1f km/jam\n", vehicleType, plateNumber, speed);
        System.out.printf("Waktu Perjalanan: %.2f jam\n\n", calculateTravelTime(distance));
    }
}