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
public class Triangulo3D extends Figuras3D {
    
    public Triangulo3D(int x, int y, int z){
        super(x,y,z);
        this.hallarArea();
        this.hallarVolumen();
    }    
          
    @Override
    public final void hallarArea(){        
        this.setArea((this.getX()*4) + ((this.getX()*this.getZ())/2));
    }    
    
    @Override
    public final void hallarVolumen(){
        this.setVolumen(((this.getX()*4)*this.getY())/3);
    }
}
