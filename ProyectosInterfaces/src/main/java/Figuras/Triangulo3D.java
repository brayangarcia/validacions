/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *Clase que representa a la pirámide
 * @author ISAACELEAZAR
 */
public class Triangulo3D extends Figuras3D {
    /**
     * Constructor de la clase que inicializa los metodos para calcular
     * @param x representa un lado de una cara de la pirámide
     * @param y representa un lado de una cara de la pirámide
     * @param z representa un lado de una cara de la pirámide
     */
    public Triangulo3D(int x, int y, int z){
        super(x,y,z);
        this.hallarArea();
        this.hallarVolumen();
    }    
    /**
     * Método que calcula el área de la pirámide
     */
    @Override
    public final void hallarArea(){        
        this.setArea((this.getX()*4) + ((this.getX()*this.getZ())/2));
    }    
    /**
     * Método que calcula el volumen de una pirámide
     */
    @Override
    public final void hallarVolumen(){
        this.setVolumen(((this.getX()*4)*this.getY())/3);
    }
}
