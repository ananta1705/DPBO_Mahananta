/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
// Parent class Animal
class Animal {
    private int age;
    private String kind;

    // Constructor
    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for kind
    public String getKind() {
        return kind;
    }

    // Setter for kind
    public void setKind(String kind) {
        this.kind = kind;
    }

    // Method to run
    public void run() {
        System.out.println("Lari!!!");
    }
}

// Subclass Cat that extends Animal
class Cat extends Animal {
    private String name;

    // Constructor for Cat
    public Cat(int age, String kind, String name) {
        super(age, kind);  // Call the constructor of Animal
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to hunt
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }

    // Method to play
    public void play() {
        System.out.println("Mainan sangat menyenangkan!!");
    }
}

// Main class to test the implementation
public class soal1 {
    public static void main(String[] args) {
        // Create a Cat object
        Cat coco = new Cat(3, "Persian", "Coco");

        // Display details
        System.out.println("Nama: " + coco.getName());
        System.out.println("Umur: " + coco.getAge() + " tahun.");
        System.out.println("Tipe: " + coco.getKind());

        // Call methods
        coco.run();
        coco.hunt();
        coco.play();
    }
}
