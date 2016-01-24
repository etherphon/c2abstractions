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
public abstract class Flying implements MythicalCreature {
    
    private int age;
    private int numWings;

    public Flying(int age, int numWings) {
        this.age = age;
        this.numWings = numWings;
    }
    
    public Flying() {
        
    }
    
    @Override
    public void attack() {
        System.out.println("Attacks from above and knocks you over.");
    }
 
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
}
