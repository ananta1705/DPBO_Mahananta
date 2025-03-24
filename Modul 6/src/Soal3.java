
class Animal {
    int age;
    String kind;


    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }


    public void run() {
        System.out.println("Lari!!!");
    }


    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }
}


class Cat extends Animal {
    String name;

    public Cat(int age, String kind, String name) {
        super(age, kind); 
        this.name = name;
    }

  
    @Override
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }


    @Override
    public void run() {
        System.out.println("Lari!!!");
    }

    public void play() {
        System.out.println("Mainan sangat menyenangkan!!");
    }
}

class Dog extends Animal {
    String name;


    public Dog(int age, String kind, String name) {
        super(age, kind);  // Memanggil constructor Animal
        this.name = name;
    }

    @Override
    public void hunt() {
        System.out.println("Menangkap rusa!!");
    }


    @Override
    public void run() {
        System.out.println("Lari dengan kecepatan 40km/jam");
    }
}


public class Soal3 {
    public static void main(String[] args) {
    
        Cat coco = new Cat(3, "Persian", "Coco");
        System.out.println("Nama: " + coco.name);
        System.out.println("Umur: " + coco.age + " tahun.");
        System.out.println("Tipe: " + coco.kind);
        coco.run();
        coco.hunt();
        coco.play();


        Dog benji = new Dog(2, "Siberian Husky", "Benji");
        System.out.println("\nNama: " + benji.name);
        System.out.println("Umur: " + benji.age + " tahun.");
        System.out.println("Tipe: " + benji.kind);
        benji.run();
        benji.hunt();
    }
}
