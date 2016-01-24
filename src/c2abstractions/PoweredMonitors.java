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
public class PoweredMonitors extends BookshelfSpeakers {
    
    private int ampWattage;
    private String inputType;

    public PoweredMonitors(int ampWattage, String inputType) {
        this.ampWattage = ampWattage;
        this.inputType = inputType;
    }

    public PoweredMonitors(int ampWattage, String inputType, Double width, Double height, Double depth, int wattage, String manufacturer, Boolean surroundCapable) {
        super(width, height, depth, wattage, manufacturer, surroundCapable);
        this.ampWattage = ampWattage;
        this.inputType = inputType;
    }

    public PoweredMonitors(int ampWattage, String inputType, Double width, Double height, Double depth) {
        super(width, height, depth);
        this.ampWattage = ampWattage;
        this.inputType = inputType;
    }
    
    
    
    
}
