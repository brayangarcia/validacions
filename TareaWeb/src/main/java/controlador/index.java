/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author USER
 */
@Named(value = "index")
@Dependent
public class index {

    private String nombre;
    private String contrasena;
    private boolean estado;
    private String[] idioma;
    private String[] programacion;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String[] getProgramacion() {
        return programacion;
    }

    public void setProgramacion(String[] programacion) {
        this.programacion = programacion;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Creates a new instance of index
     */
    public index() {
    }
    
    public void Redireccionar(){
        //logica
        
    }
    
    public String IrAmarte(){
        return "mision";
    }
    
}
