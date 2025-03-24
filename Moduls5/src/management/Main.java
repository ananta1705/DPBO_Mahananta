/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        Departement dept = new Departement("D001", "IT Department", 3);

        Employe e1 = new Employe("E001", "John Doe");
        Employe e2 = new Employe("E002", "Jane Smith");

        dept.addEmployee(e1);
        dept.addEmployee(e2);

        dept.printEmployeeList();
        
        dept.deleteEmployee(e1);
        dept.printEmployeeList();
    }
}
