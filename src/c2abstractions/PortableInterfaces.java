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
public abstract class PortableInterfaces implements AudioInterface {
    
    private int[] sampleRates;
    private String manufacturer;
    private Boolean busPowered;
    private int aOutputs;
    private int dOutputs;
    
    public PortableInterfaces() {    
    }
    
    @Override
    public int getOutputs() {
        return aOutputs + dOutputs;
    }
    
    @Override
    public int maxSampleRate() {
        int biggest = 0;
        for (int i = 0; i < sampleRates.length; i++) {
            if (sampleRates[i] > biggest) {
                biggest = sampleRates[i];
            }
        }
        return biggest;
    }
    
    @Override
    public void setDigitalOutputs(int dOutputs) {
        
    }
    
    @Override
    public void setAnalogOutputs(int aOutputs) {
        this.aOutputs = aOutputs;
    }
    
}
