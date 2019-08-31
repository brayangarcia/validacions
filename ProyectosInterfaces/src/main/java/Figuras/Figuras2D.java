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
public abstract class Figuras2D extends Figuras{
    
    private int x;
    
    private int y;
    
    private double perimetro;    

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
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

    public Figuras2D(int x, int y) {
        
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void hallarArea() {
         
    }
    
    public void hallarPerimetro(){
        
    }
}
