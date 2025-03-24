/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */

class Doctor {

    private String name;
    private String department;


    public Doctor(String name, String department) {
        this.name = name;
        this.department = department;
    }

  
    public String getName() {
        return name;
    }

  
    public String getDepartment() {
        return department;
    }


    public void treatPatient() {
        System.out.println("Telah merawat pasien.");
    }
}


class Dentist extends Doctor {

   
    public Dentist(String name) {
        super(name, "Kedokteran Gigi");
    }

   
    public void pullOutTooth() {
        System.out.println("Telah mencabut gigi pasien.");
    }
}


public class soal2 {
    public static void main(String[] args) {
       
        Dentist dentist = new Dentist("Dokter Andi");

      
        System.out.println("Kedokteran Gigi: " + dentist.getName());

 
        dentist.treatPatient();
        dentist.pullOutTooth();
    }
}

