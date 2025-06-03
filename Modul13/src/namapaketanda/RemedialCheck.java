/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namapaketanda;
import java.util.ArrayList;
import namapaketanda.Subject;
/**
 *
 * @author ASUS
 */
        
public class RemedialCheck {

    // Ini adalah main method yang benar
    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();

        // Pastikan kelas Subject bisa diakses.
        // Jika Subject ada di package berbeda dan belum diimpor, ini akan error.
        // Jika nama package untuk Subject adalah tpmodul13, dan RemedialCheck
        // ada di namapaketanda, maka Subject harus diimpor.
        // Asumsi Subject juga ada di namapaketanda atau sudah diimpor dengan benar:
        subjects.add(new Subject("Sejarah", 86));
        subjects.add(new Subject("Geografi", 65));
        subjects.add(new Subject("Biologi", 58));
        subjects.add(new Subject("Fisika", 76));

        System.out.println("Pelajaran yang perlu kelas tambahan");

        for (Subject subject : subjects) {
            try {
                if (subject.getScore() < 70) {
                    throw new Exception(subject.getName() + " (" + subject.getScore() + " poin)");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Semoga Selalu Diberi Kemudahan ^^");
    }
}