/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 * Clase que representa las figuras y hereda de la clase Comportamiento
 * @author ISAACELEAZAR
 */
public abstract class Figuras implements Comportamiento{
    /**
     * Variable que representa el area de la figura
     */
    private double area;
    /**
     * 
     * @return 
     */
    public double getArea() {
        return area;
    }
    /**
     * 
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * 
     */
    public Figuras() {        
    }
    /**
     * 
     */
    @Override
    public void hallarArea(){
        
    }
    
}
