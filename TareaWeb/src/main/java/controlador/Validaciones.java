/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.*;
import modelo.Logica;
import sun.security.util.Length;

/**
 *
 * @author USER
 */
@Named(value = "validaciones")
@SessionScoped
public class Validaciones implements Serializable{
    /**
     * Creates a new instance of Validaciones
     */
    Logica logica = new Logica();
    
    @NotNull
    private String vacios;
    
    @NotNull
    @Size(min=1, max=30)
    private String tamano;
    
    @NotNull
    @Digits(integer=1000, fraction=5)
    private String valores;
    
    @NotNull
    //@Email
    private String correo;
    
    @NotNull
    //@PastOrPresent
    private String fecha;
    
    @NotNull
    //@Length(min=2, max=1000)
    @Pattern(regexp="$")
    private String moneda;
    
    @NotNull    
    private String error;
    private String errorVacio;
    
    @PostConstruct
    public void validar(){
        //setError(logica.validar(vacios,tamano,valores,correo,fecha,moneda));
        //error = logica.validar(vacios,tamano,valores,correo,fecha,moneda);
    }
    
    public String getVacios() {
        return vacios;
    }

    public void setVacios(String vacios) {
        this.vacios = vacios;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorVacio() {
        return errorVacio;
    }

    public void setErrorVacio(String errorVacio) {
        this.errorVacio = errorVacio;
    }
    
}
