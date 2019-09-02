/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *Clase padrea que hereda de Figuras
 * 
 * @author ISAACELEAZAR
 */

public class Figuras3D extends Figuras{
    
    private int x;

    private int y;
    
    private int z;
    
    private double volumen;

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Figuras3D(int x, int y, int z) {        
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    @Override
    public void hallarArea() {
         
    }
    
    public void hallarVolumen(){
        
    }
}
