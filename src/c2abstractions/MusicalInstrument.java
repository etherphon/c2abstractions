/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2abstractions;

/**
 *
 * @author etherdesign
 */
public abstract class MusicalInstrument {
    private String manufacturer;
    private int yearMade;
    private Boolean electric;
    private String[] scales;

    public MusicalInstrument(String manufacturer, int yearMade, Boolean electric, String[] scales) {
        this.manufacturer = manufacturer;
        this.yearMade = yearMade;
        this.electric = electric;
        this.scales = scales;
    }
    
    public MusicalInstrument() {
        
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    public String[] getScales() {
        return scales;
    }

    public void setScales(String[] scales) {
        this.scales = scales;
    }
    
    public abstract void makeSound();
    
}
