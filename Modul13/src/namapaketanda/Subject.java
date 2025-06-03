/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namapaketanda;

/**
 *
 * @author ASUS
 */
public class Subject {
    private String name;
    private int score;
    
    public Subject(String name, int score){
        this.name = name;
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public String getName(){
        return name;
    }
}
