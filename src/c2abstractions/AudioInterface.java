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
public interface AudioInterface {
    
    public abstract int getOutputs();
    
    public abstract void setAnalogOutputs(int aOutputs);
    
    public abstract void setDigitalOutputs(int dOutputs);
    
    public abstract int maxSampleRate();
    
}
