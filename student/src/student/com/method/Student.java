/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.com.method;

/**
 *
 * @author ASUS
 */
public class Student {

    private String name;
    private String courseId;
    private double bahasaScore;
    private double englishScore;
    private double mathScore;

    public Student(String name, String courseId, double bahasaScore, double englishScore, double mathScore) {
        this.name = name;
        this.courseId = courseId;
        this.bahasaScore = bahasaScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public double calculateAverage() {
        return (bahasaScore + englishScore + mathScore) / 3;
    }

    public void printStudentInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Nomor Mata Kuliah: " + courseId);
        System.out.println("Nilai Bahasa: " + bahasaScore);
        System.out.println("Nilai Bahasa Inggris: " + englishScore);
        System.out.println("Nilai Matematika: " + mathScore);
        System.out.println("Rata-rata Nilai: " + calculateAverage());
    }

    public void changeStudentId(String newId) {
        this.courseId = newId;
        System.out.println("Nomor mata kuliah telah diperbarui menjadi: " + newId);
    }
}
