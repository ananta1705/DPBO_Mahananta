/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management;

/**
 *
 * @author ASUS
 */


public class Departement {
    private String id;
    private String name;
    private int maxNum;
    private Employe[] employeeList;
    private int employeeCount;

    public Departement(String id, String name, int maxNum) {
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        this.employeeList = new Employe[maxNum];
        this.employeeCount = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void printEmployeeList() {
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employeeList[i].toString());
        }
    }

    public boolean canAddEmployee() {
        return employeeCount < maxNum;
    }

    public void addEmployee(Employe employee) {
        if (canAddEmployee()) {
            employeeList[employeeCount++] = employee;
            employee.setDepartement(this);
        } else {
            System.out.println("Cannot add employee. Department is full.");
        }
    }

    public void deleteEmployee(Employe employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employeeList[i] == employee) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employeeList[j] = employeeList[j + 1];
                }
                employeeCount--;
                break;
            }
        }
    }
}
