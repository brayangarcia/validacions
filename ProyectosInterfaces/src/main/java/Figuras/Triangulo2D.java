/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import static java.lang.Math.sqrt;

/**
 * Clase que representa un triángulo
 * @author ISAACELEAZAR
 */
public class Triangulo2D extends Figuras2D{
    /**
     * Variable de tipo entero que representa el tercer lado del triangulo
     */
    private int lado3;   
    /**
     * Variable de tipo String que representa el tipo de triangulo que es
     */
    private String tipo;
    /**
     * Constructor de la clase que inicializa los métodos de hallar area y perimetro
     * @param lado3 representa una lado de la figura
     * @param x representa una lado de la figura
     * @param y representa una lado de la figura
     */
    public Triangulo2D(int lado3,int x, int y) {
        super(x, y);
        this.lado3 = lado3;        
        this.hallarArea();
    }   
    /**
     * @return el tipo de triángulo que es
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Método que establece el tipo de triangulo que es
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
    
    /**          
     * @return el tercer lado de la figura
     */
    public int getLado3() {
        return lado3;
    }
    /**
     * establece el tercer lado de la figura
     * @param lado3 
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }    
    /**
     * Método que halla el área del triangulo y analiza de que tipo es
     */
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
    /**
     * Método que halla el perímetro del triangulo
     */
    @Override
    public void hallarPerimetro(){
        this.setPerimetro(this.getX()+this.getY()+this.getLado3());
    }    
}
