/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author ASUS
 */
import java.util.HashMap;
import java.util.Map;
// Jika urutan output harus sama persis seperti di soal, gunakan LinkedHashMap
// import java.util.LinkedHashMap;


public class StudentMapTest {
    public static void main(String[] args) {
        // Membuat HashMap untuk menyimpan objek Student dengan NIM sebagai kunci
        // Jika urutan penting, gunakan: Map<String, Student> studentMap = new LinkedHashMap<>();
        Map<String, Student> studentMap = new HashMap<>();

        // Menambahkan data siswa ke HashMap
        studentMap.put("STU001", new Student("STU001", "Darla", 80, 90, 95));
        studentMap.put("STU002", new Student("STU002", "Rafi", 95, 89, 92));
        studentMap.put("STU003", new Student("STU003", "Ahmad", 88, 97, 94));

        // Menampilkan data setiap siswa sesuai format "Hasil Run"
        // HashMap tidak menjamin urutan. Jika urutan seperti di "Hasil Run"
        // (STU001, STU002, STU003) adalah keharusan, kita bisa iterate
        // berdasarkan array kunci yang sudah diketahui atau menggunakan LinkedHashMap.

        System.out.println("Hasil Run:");

        // Cara 1: Iterasi berdasarkan array kunci yang diketahui urutannya (untuk memastikan output sama persis)
        String[] nims = {"STU001", "STU002", "STU003"};
        for (String nim : nims) {
            if (studentMap.containsKey(nim)) {
                System.out.println(studentMap.get(nim).toString());
            }
        }

        // Cara 2: Iterasi standar Map (urutan tidak dijamin untuk HashMap)
        // Jika menggunakan LinkedHashMap, urutan akan sesuai penambahan.
        /*
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        */
    }
}