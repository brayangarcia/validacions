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
public class Triangulo2D extends Figuras2D{
    
    private int lado3;
    
    private int altura;

    public Triangulo2D(int lado3, int altura, int x, int y) {
        super(x, y);
        this.lado3 = lado3;
        this.altura = altura;
    }

    /**
     *
     * @param x
     * @param y
     * @param lado3
     * @param altura
     */


    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void hallarArea() {
         this.setArea((this.getX() * this.getAltura())/2);
    }
    
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(this.getX()+this.getY()+this.getLado3());
    }
    
}
