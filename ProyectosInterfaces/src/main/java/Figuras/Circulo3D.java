/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *  Clase que representa la esfera que hereda de la clase Figuras 3D
 * @author ISAACELEAZAR
 */
public class Circulo3D extends Figuras3D{
    /**
     * Variable constante que representa el número PI
     */
    private final double PI = 3.141592;
    /**
     * Contructor de la clase que recibe un parametro
     * @param x 
     */
    public Circulo3D(int x){
        super(x,0,0);
    }
    /**
     * Método vacío que calcula el área de la esfera
     */
    @Override
    public void hallarArea(){
        this.setArea(4*PI*this.getX()*this.getX());        
    }    
    /**
     * Método vacío que calcula el volumen de la esfera
     */
    @Override
    public void hallarVolumen(){
        this.setVolumen((4/3)*PI*this.getX()*this.getX()*this.getX());
    }
    
}
