/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method;

/**
 *
 * @author ASUS
 */
//Anantaputimaharani
public class Student {
    private String studentId, studentName;
    private int korean, english, math;

    public Student(String studentId, String studentName, int korean, int english, int math) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public double calculateAverage() {
        return (korean + english + math) / 3.0;
    }

    public void printStudentInfo() {
        System.out.printf("ID: %s\nName: %s\nKorean: %d\nEnglish: %d\nMath: %d\nAverage: %.2f\n",
                studentId, studentName, korean, english, math, calculateAverage());
    }

    public void changeStudentId(String newId) {
        studentId = newId;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        Student student = new Student("22012345", "Ananta", 75, 80, 85);
        student.printStudentInfo();
        student.changeStudentId("22067890");
        System.out.println("Updated ID: " + student.getStudentId());
    }
}