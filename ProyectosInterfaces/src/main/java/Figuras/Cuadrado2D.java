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
public class Cuadrado2D extends Figuras2D{    
    
    String tipo;
    
    public Cuadrado2D(int x, int y, String tipo) {
        super(x, y);
        this.tipo = tipo;
    }
    
    @Override
    public void hallarArea() {
        if(this.getX() == this.getY())
            this.setArea(this.getX() * this.getX());
        else
            this.setArea(this.getX()*2 + this.getY()*2);
    }
    
    
    
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(this.getX()*4);
    }
}
