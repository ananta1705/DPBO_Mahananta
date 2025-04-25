/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moduls8;

/**
 *
 * @author ASUS
 */
// Travel.java
public class Travel {
    private String travelCode;
    private String cityName;
    private String flight;
    private String travelType;
    private int reserved;

    public Travel(String travelCode, String cityName, String flight, String travelType) {
        this.travelCode = travelCode;
        this.cityName = cityName;
        this.flight = flight;
        this.travelType = travelType;
        this.reserved = 0;
    }

    public String getTravelCode() {
        return travelCode;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getReserved() {
        return reserved;
    }

    public String getCityName() {
        return cityName;
    }

    public String getFlight() {
        return flight;
    }

    public String toString() {
        return travelCode + "\t" + cityName + "\t" + flight + "\t" + travelType + "\t" + "N/A\t" + "N/A\t" + reserved + "orang";
    }
}

