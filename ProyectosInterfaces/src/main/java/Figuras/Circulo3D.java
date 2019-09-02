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
public class Circulo3D extends Figuras3D{
    
    private final double PI = 3.141592;
    
    public Circulo3D(int x){
        super(x,0,0);
    }
    
    @Override
    public void hallarArea(){
        this.setArea(4*PI*this.getX()*this.getX());        
    }    
    @Override
    public void hallarVolumen(){
        this.setVolumen((4/3)*PI*this.getX()*this.getX()*this.getX());
    }
    
}
