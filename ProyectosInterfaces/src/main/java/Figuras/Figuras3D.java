/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *Clase padre Figuras3D que hereda de Figuras y es el esqueleto de
 * las clases que representan las figuras 3D
 * @author ISAACELEAZAR
 */

public abstract class Figuras3D extends Figuras{
    /**
     * Variable que representa un valor de una figura
     **/
    private int x;
    /**
     * Variable que representa un valor de una figura
     **/
    private int y;
    /**
    * Variable que representa un valor de una figura
    **/
    private int z;
    /**
    * Variable que representa el valor volumen de una figura
    **/
    private double volumen;
    /**    
    * @return un valor Double que representa el Volumen de la figura
    **/
    public double getVolumen() {
        return volumen;
    }
    /**
    Método vacío que establece el volumen de la figura
    @param volumen de la figura
    **/
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    /**
    Contructor de la clase que recibe tres parámetros
    @param x Valor de tipo entero que representa un valor de la figura
    @param y Valor de tipo entero que representa un valor de la figura
    @param z Valor de tipo entero que representa un valor de la figura   
    **/
    public Figuras3D(int x, int y, int z) {        
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
      *@return un valor entero 
    **/    
    public int getX() {
        return x;
    }
    /**
      establece un valor de la figura
      @param x
    **/
    public void setX(int x) {
        this.x = x;
    }
    /**
      *@return un valor entero 
    **/    
    public int getY() {
        return y;
    }
    /**
      * establece un valor de la figura
      @param y
    **/
    public void setY(int y) {
        this.y = y;
    }
    /**
     * @return un valor entero      
     */    
    public int getZ() {
        return z;
    }
    /**
        establece un valor de la figura
     * @param z
    **/
    public void setZ(int z) {
        this.z = z;
    }
    /**
     * Método vacío heredado de la clase Figuras
     */
    @Override
    public void hallarArea() {
         
    }
    /**
     * Método vacío que heredan las clases hijas para hallar el Volumen
     */
    public void hallarVolumen(){
        
    }
}
