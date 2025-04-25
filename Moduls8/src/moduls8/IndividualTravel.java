/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls8;

/**
 *
 * @author ASUS
 */
public class IndividualTravel extends Travel {
    private int maxPeople;

    public IndividualTravel(String travelCode, String cityName, String flight, String travelType, int maxPeople) {
        super(travelCode, cityName, flight, travelType);
        this.maxPeople = maxPeople;
    }

    public void setReserved(int reserved) {
        if (reserved > maxPeople) {
            System.out.println("Error: Melebihi jumlah maksimum orang yang diizinkan.");
        } else {
            super.setReserved(reserved);
        }
    }

    public String toString() {
        return getTravelCode() + "\t" + getCityName() + "\t" + getFlight() + "\t" + getTravelType()
                + "\t" + "N/A" + "\t" + maxPeople + "orang\t" + getReserved() + "orang";
    }
}

