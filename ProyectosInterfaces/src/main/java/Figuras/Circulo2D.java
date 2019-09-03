/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 * Clase que representa el circulo y hereda de la clase Figuras2D
 * @author ISAACELEAZAR
 */
public final class Circulo2D extends Figuras2D {
     /**
     * Variable constante que representa el número PI
     */
    private final double PI = 3.141592;
    /**
     * Constructor de la clase que inicializa los métodos de hallar área y perímetro
     * @param x 
     */
    public Circulo2D(int x) {
        super(x,0);
        this.hallarArea();
        this.hallarPerimetro();
    }
    /**
     * Método que halla el área del círculo
     */
    @Override
    public void hallarArea(){
        this.setArea(PI*2*this.getX());
    }
    /**
     * Método que halla el perímetro del círculo
     */
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(PI*this.getX()*this.getX());
    }
    
}
