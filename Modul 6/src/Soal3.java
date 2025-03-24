
class Animal {
    int age;
    String kind;

    // Constructor untuk Animal
    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }

    // Metode untuk berlari
    public void run() {
        System.out.println("Lari!!!");
    }

    // Metode untuk berburu
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }
}

// Class Cat yang turunan dari Animal
class Cat extends Animal {
    String name;

    // Constructor untuk Cat
    public Cat(int age, String kind, String name) {
        super(age, kind);  // Memanggil constructor Animal
        this.name = name;
    }

    // Overriding metode hunt() untuk Cat
    @Override
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }

    // Overriding metode run() untuk Cat
    @Override
    public void run() {
        System.out.println("Lari!!!");
    }

    // Metode play() untuk Cat
    public void play() {
        System.out.println("Mainan sangat menyenangkan!!");
    }
}

// Class Dog yang turunan dari Animal
class Dog extends Animal {
    String name;

    // Constructor untuk Dog
    public Dog(int age, String kind, String name) {
        super(age, kind);  // Memanggil constructor Animal
        this.name = name;
    }

    // Overriding metode hunt() untuk Dog
    @Override
    public void hunt() {
        System.out.println("Menangkap rusa!!");
    }

    // Overriding metode run() untuk Dog
    @Override
    public void run() {
        System.out.println("Lari dengan kecepatan 40km/jam");
    }
}

// Kelas utama untuk menjalankan program
public class Soal3 {
    public static void main(String[] args) {
        // Membuat objek Cat
        Cat coco = new Cat(3, "Persian", "Coco");
        System.out.println("Nama: " + coco.name);
        System.out.println("Umur: " + coco.age + " tahun.");
        System.out.println("Tipe: " + coco.kind);
        coco.run();
        coco.hunt();
        coco.play();

        // Membuat objek Dog
        Dog benji = new Dog(2, "Siberian Husky", "Benji");
        System.out.println("\nNama: " + benji.name);
        System.out.println("Umur: " + benji.age + " tahun.");
        System.out.println("Tipe: " + benji.kind);
        benji.run();
        benji.hunt();
    }
}
