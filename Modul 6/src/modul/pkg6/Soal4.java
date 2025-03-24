/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
// Class Movie yang mendefinisikan film dasar
class Movie {
    String title;
    String director;
    String genre;

    // Constructor untuk Movie
    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    // Metode untuk menampilkan informasi film
    public String toString() {
        return "Judul: " + title + ", Director: " + director + ", Genre: " + genre;
    }
}

// Class SfMovie yang turunan dari Movie, untuk film genre SF
class SfMovie extends Movie {

    // Constructor untuk SfMovie
    public SfMovie(String title, String director) {
        super(title, director, "SF");  // Menyertakan genre SF untuk film ini
    }
}

// Kelas utama untuk menjalankan program
public class Soal4 {
    public static void main(String[] args) {
        // Membuat objek film SF
        SfMovie movie1 = new SfMovie("Avatar", "James Cameron");
        SfMovie movie2 = new SfMovie("AI", "Steven Spielberg");

        // Mencetak informasi film menggunakan metode toString()
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }
}
