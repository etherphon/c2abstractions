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
public class Dragon extends Flying {
    
    private String dragonType;

    public Dragon(String dragonType, int age, int numWings) {
        super(age, numWings);
        this.dragonType = dragonType;
    }
    
    @Override
    public String getAge() {
        return "Dragons are pretty much immortal anyways.";
    }
    
    @Override
    public void attack() {
        System.out.println("The dragon attacks with his " + dragonType + " breath.");
    }
    
    
}
