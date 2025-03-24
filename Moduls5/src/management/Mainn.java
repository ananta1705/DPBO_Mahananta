/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

/**
 *
 * @author ASUS
 */


public class Mainn {
    public static void main(String[] args) {
        // Create Departments (SDM, Tim Teknis, Tim Keamanan)
        Department sdm = new Department("D001", "SDM", 5);
        Department timTeknis = new Department("D002", "Tim Teknis", 3);
        Department timKeamanan = new Department("D003", "Tim Keamanan", 2);

        // Add employees to the departments
        Employee emp01 = new Employee("EMP01", "John Doe");
        Employee emp02 = new Employee("EMP02", "Jane Smith");
        Employee emp03 = new Employee("EMP03", "Mike Johnson");
        Employee emp04 = new Employee("EMP04", "Emily Davis");
        Employee emp05 = new Employee("EMP05", "David Lee");
        Employee emp06 = new Employee("EMP06", "Sophia Brown");
        Employee emp07 = new Employee("EMP07", "James Wilson");
        Employee emp08 = new Employee("EMP08", "Olivia Moore");
        Employee emp09 = new Employee("EMP09", "Lucas Garcia");
        Employee emp10 = new Employee("EMP10", "Isabella Martinez");
        Employee emp11 = new Employee("EMP11", "Ethan Taylor");

        // Assign employees to the departments
        sdm.addEmployee(emp01);
        timTeknis.addEmployee(emp02);
        timTeknis.addEmployee(emp03);
        timKeamanan.addEmployee(emp04);

        // Print employee list for each department
        System.out.println("Initial Department Status:");
        sdm.printEmployeeList();
        timTeknis.printEmployeeList();
        timKeamanan.printEmployeeList();
        
        // Add more employees to the departments
        sdm.addEmployee(emp05);
        timTeknis.addEmployee(emp06);
        timKeamanan.addEmployee(emp07);
        sdm.addEmployee(emp08);
        timTeknis.addEmployee(emp09);
        timKeamanan.addEmployee(emp10);
        sdm.addEmployee(emp11);
        
        System.out.println("\nAfter Adding More Employees:");
        sdm.printEmployeeList();
        timTeknis.printEmployeeList();
        timKeamanan.printEmployeeList();

        // Move employees to different departments based on rules
        System.out.println("\nMoving Employees:");
        if (emp02.getId().endsWith("02")) {
            timKeamanan.addEmployee(emp02); // Move emp02 to Tim Keamanan
            timTeknis.deleteEmployee(emp02); // Remove from Tim Teknis
        }
        if (emp03.getId().endsWith("03")) {
            sdm.addEmployee(emp03); // Move emp03 to SDM
            timTeknis.deleteEmployee(emp03); // Remove from Tim Teknis
        }
        if (emp04.getId().endsWith("04")) {
            timTeknis.addEmployee(emp04); // Move emp04 to Tim Teknis
            timKeamanan.deleteEmployee(emp04); // Remove from Tim Keamanan
        }
        
        // Print final employee lists after movement
        System.out.println("\nFinal Department Status after Employee Movement:");
        sdm.printEmployeeList();
        timTeknis.printEmployeeList();
        timKeamanan.printEmployeeList();
    }
}

