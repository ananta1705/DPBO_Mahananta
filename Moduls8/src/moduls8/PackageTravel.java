/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduls8;

/**
 *
 * @author ASUS
 */
public class PackageTravel extends Travel {
    private int minPeople;

    public PackageTravel(String travelCode, String cityName, String flight, String travelType, int minPeople) {
        super(travelCode, cityName, flight, travelType);
        this.minPeople = minPeople;
    }

    public String toString() {
        return getTravelCode() + "\t" + getCityName() + "\t" + getFlight() + "\t" + getTravelType()
                + "\t" + minPeople + "orang\t" + "N/A\t" + getReserved() + "orang";
    }
}
