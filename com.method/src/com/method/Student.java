package com.method;

public class Student {
    private String name;
    private String courseId;
    private double bahasaScore;
    private double englishScore;
    private double mathScore;

    // Constructor
    public Student(String name, String courseId, double bahasaScore, double englishScore, double mathScore) {
        this.name = name;
        this.courseId = courseId;
        this.bahasaScore = bahasaScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // Menghitung rata-rata nilai siswa
    public double calculateAverage() {
        return (bahasaScore + englishScore + mathScore) / 3;
    }

    // Menampilkan informasi siswa
    public void printStudentInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Nomor Mata Kuliah: " + courseId);
        System.out.println("Nilai Bahasa: " + bahasaScore);
        System.out.println("Nilai Bahasa Inggris: " + englishScore);
        System.out.println("Nilai Matematika: " + mathScore);
        System.out.println("Rata-rata Nilai: " + calculateAverage());
    }

    // Mengubah nomor mata kuliah siswa
    public void changeStudentId(String newId) {
        this.courseId = newId;
        System.out.println("Nomor mata kuliah telah diperbarui menjadi: " + newId);
    }
}
