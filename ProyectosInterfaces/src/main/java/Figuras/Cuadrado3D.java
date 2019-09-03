/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *Clase Cuadrado3D que hereda de la clase Figuras 3D que
 * representa a un cubo
 * @author ISAACELEAZAR
 */
public class Cuadrado3D extends Figuras3D{
    /**
     * Variable de tipo String que representa el tipo de figura que es
     */
    public String tipo;
    
    /**
     * Constructor de la clase que recibe los parámetro e inicializa los métodos
     * @param x que representa el valor del primer lado
     * @param y que representa el valor del segundo lado
     */
    public Cuadrado3D(int x, int y){
        super(x,y,0);
        this.hallarArea();
        this.hallarVolumen();
    }
    /**
     * Método que obtiene el tipo de Cubo que es
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el tipo de Cubo que es
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }       
    /**
     * Método vacio que calcula el Area del cubo y establece el tipo de figura que es
     */
    @Override
    public final void hallarArea(){
        this.setArea(6*(this.getX()*this.getY()));
        if(this.getX() == this.getY())
            this.setTipo("CUBO");
        else
            this.setTipo("CUBO RECTANGULAR");
    }
    /**
     * Método vacío que calcula el volumen de la figura
     */
    @Override
    public final void hallarVolumen(){
        this.setVolumen(this.getArea()*this.getArea()*this.getArea());
    }
}
