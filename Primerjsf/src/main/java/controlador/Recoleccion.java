/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author USER
 */
@Named(value = "Recoleccion")
@RequestScoped
public class Recoleccion {
    /**
     * Variable que guardara el nombre
     */
    private String nombre;
    /**
     * Variable que guarda el apellido
     */
    private String Apellido;
    /**
     * Varibale que guarda la profesion
     */
    private String profesion;
    /**
     * Variable que guarda el genero
     */
    private String genero;
    /**
     * Varible que guarda los idiomas
     */
    private String[] idiomas;
    /**
     * Variable que guarda la ubicacion
     */
    private String ubicacion;
    /**
     * Variable que guarda los dias trabajados
     */
    private int diasTrabajo;
    
    /**
     * Creates a new instance of Recoleccion
     */
    public Recoleccion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }
    
}
