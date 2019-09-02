/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author ISAACELEAZAR
 */
public class Cuadrado2D extends Figuras2D{    
    
    String tipo;
    
    public Cuadrado2D(int x, int y) {
        super(x, y);
        this.hallarArea();
        this.hallarPerimetro();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public final void hallarArea() {
        if(this.getX() == this.getY()){            
            this.setArea(this.getX() * this.getX());
            this.setTipo("Cuadrado");
        }
        else{
            this.setArea(this.getX()*2 + this.getY()*2);
            this.setTipo("Rectangulo");
        }            
    }
    
    @Override
    public final void hallarPerimetro(){
        this.setPerimetro(this.getX()*4);
    }
}
