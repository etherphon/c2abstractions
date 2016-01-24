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
public class Synthesizer extends Keyboards {
 
    private String type;
    private int numOscillators;

    public Synthesizer(String type, int numOscillators, int numKeys, int outputs, Boolean midiCapable, String manufacturer, int yearMade, Boolean electric, String[] scales) {
        super(numKeys, outputs, midiCapable, manufacturer, yearMade, electric, scales);
        this.type = type;
        this.numOscillators = numOscillators;
    }

    public Synthesizer(String type, int numOscillators, int numKeys, int outputs, Boolean midiCapable) {
        super(numKeys, outputs, midiCapable);
        this.type = type;
        this.numOscillators = numOscillators;
    }

    public Synthesizer(String type, int numOscillators) {
        this.type = type;
        this.numOscillators = numOscillators;
    }

    @Override
    public void makeSound() {
        System.out.println("Now we can play the theme from Close Encounters.");
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOscillators() {
        return numOscillators;
    }

    public void setNumOscillators(int numOscillators) {
        this.numOscillators = numOscillators;
    }
    
    
    
}
