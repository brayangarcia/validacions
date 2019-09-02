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
public class Cuadrado3D extends Figuras3D{
    
    public Cuadrado3D(int x){
        super(x,0,0);
        this.hallarArea();
        this.hallarVolumen();
    }
    
    @Override
    public final void hallarArea(){
        this.setArea(6*(this.getX()*this.getX()));
    }
    
    @Override
    public final void hallarVolumen(){
        this.setVolumen(this.getArea()*this.getArea()*this.getArea());
    }
}
