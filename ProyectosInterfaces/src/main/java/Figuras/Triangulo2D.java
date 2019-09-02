/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import static java.lang.Math.sqrt;

/**
 *
 * @author USER
 */
public class Triangulo2D extends Figuras2D{
    
    private int lado3;   
    
    private String tipo;

    public Triangulo2D(int lado3,int x, int y) {
        super(x, y);
        this.lado3 = lado3;        
        this.hallarArea();
    }   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
    
    /**     
     * @return
     */
    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }    
    
    @Override
    public final void hallarArea() {
         double semi = (this.getX() + this.getY() + this.getLado3())/2;
         this.setArea(sqrt(semi*(semi-this.getX())*(semi-this.getY())*(semi-this.getLado3())));
         if(this.getX() == this.getY() && this.getX() == this.lado3 && this.lado3 == this.getY()){
             this.setTipo("Equilatero");
         }
         else if(this.getX() == this.getY() | this.getX() == this.lado3 | this.lado3 == this.getY()){
             this.setTipo(("Isósceles"));
         }
         else{
             this.setTipo("Escaleno");
         }
    }
    
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(this.getX()+this.getY()+this.getLado3());
    }    
}
