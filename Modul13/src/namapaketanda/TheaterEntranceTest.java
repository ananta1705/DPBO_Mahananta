/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namapaketanda;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;

public class TheaterEntranceTest {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Hong Gil-dong", 23));
        people.add(new Person("Hong Gil-sun", 17));

        System.out.println("Masuk ke bioskop.");

        for (Person person : people) {
            System.out.print(person.getName() + ": "); // Sesuai format output di "Hasil Run"
            try {
                if (person.getAge() < 19) {
                    // Melempar exception secara eksplisit
                    throw new Exception("Dilarang masuk!!");
                } else {
                    System.out.println("Silahkan masuk~");
                }
            } catch (Exception e) {
                // Menangkap exception yang dilempar
                System.out.println(e.getMessage());
            }
        }
    }
}