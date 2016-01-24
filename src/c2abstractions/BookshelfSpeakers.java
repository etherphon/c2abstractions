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
public class BookshelfSpeakers extends Speakers {
    
    private Double width;
    private Double height;
    private Double depth;
    
    public BookshelfSpeakers() {
        
    }

    public BookshelfSpeakers(Double width, Double height, Double depth, int wattage, String manufacturer, Boolean surroundCapable) {
        super(wattage, manufacturer, surroundCapable);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public BookshelfSpeakers(Double width, Double height, Double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public String getDimensions() {
        return width + " x " + height + " x " + depth;
    }
    
}
