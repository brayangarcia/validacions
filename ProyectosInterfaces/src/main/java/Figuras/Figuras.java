/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author USER
 */
public abstract class Figuras implements Comportamiento{
    
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Figuras() {        
    }

    @Override
    public void hallarArea(){
        
    }
    
}
