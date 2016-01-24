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
public abstract class Speakers {

    private int wattage;
    private String manufacturer;
    private Boolean surroundCapable;
    
    public Speakers(int wattage, String manufacturer, Boolean surroundCapable) {
        this.wattage = wattage;
        this.manufacturer = manufacturer;
        this.surroundCapable = surroundCapable;
    }
    
    public Speakers() {
        
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getSurroundCapable() {
        return surroundCapable;
    }

    public void setSurroundCapable(Boolean surroundCapable) {
        this.surroundCapable = surroundCapable;
    }
    
    
    
    
}
