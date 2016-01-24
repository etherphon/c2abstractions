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
public class Keyboards extends MusicalInstrument {
    
    private int numKeys;
    private int outputs;
    private Boolean midiCapable;

    public Keyboards(int numKeys, int outputs, Boolean midiCapable, String manufacturer, int yearMade, Boolean electric, String[] scales) {
        super(manufacturer, yearMade, electric, scales);
        this.numKeys = numKeys;
        this.outputs = outputs;
        this.midiCapable = midiCapable;
    }

    public Keyboards(int numKeys, int outputs, Boolean midiCapable) {
        this.numKeys = numKeys;
        this.outputs = outputs;
        this.midiCapable = midiCapable;
    }

    public Keyboards () {
        
    }
    
    @Override
    public void makeSound() {
        System.out.println("How about a nice organ patch?");
    }
    
    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public int getOutputs() {
        return outputs;
    }

    public void setOutputs(int outputs) {
        this.outputs = outputs;
    }

    public Boolean getMidiCapable() {
        return midiCapable;
    }

    public void setMidiCapable(Boolean midiCapable) {
        this.midiCapable = midiCapable;
    }
    
    
}
