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
public final class Circulo2D extends Figuras2D {
    
    private final double PI = 3.141592;

    public Circulo2D(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void hallarArea(){
        this.setArea(PI*2*this.getX());
    }
    
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(PI*this.getX()*this.getX());
    }
    
}
