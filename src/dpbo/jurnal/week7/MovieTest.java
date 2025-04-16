/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpbo.jurnal.week7;

/**
 *
 * @author ASUS
 */
public class MovieTest {
    public static void main(String[] args) {
        SfMovie[] sfMovies = {
            new SfMovie("Avatar", "James Cameron"),
            new SfMovie("AI", "Steven Spielberg")
        };

        for (int inx = 0; inx < sfMovies.length; inx++) {
            System.out.println(sfMovies[inx].toString());
        }
    }
}