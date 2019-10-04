/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;
import modelo.PagoModelo;

/**
 *
 * @author USER
 */
@Named(value = "pago")
@RequestScoped

public class Pago{
    /**
     * Variable de la clase Recolecion que trae los datos
     */
    @Inject
    private Recoleccion recoleccion;
    /**
     * Variable que guarda el salario
     */
    private double salario;
    /**
     * Variable que guarda el idioma
     */
    private String idioma;
    /**
     * Variable que guarda el sexo
     */
    private String sexo;
    /**
     * Creates a new instance of Pago
     */

    public Recoleccion getRecoleccion() {
        return recoleccion;
    }

    public void setRecoleccion(Recoleccion recoleccion) {
        this.recoleccion = recoleccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * Metodo que recibe el salario final, los idiomas que habla la persona
     * y define el sexo de la persona
     */
    @PostConstruct
    public void personaFinal(){
        PagoModelo pagofinal = new PagoModelo(recoleccion);
        salario = pagofinal.envioSalario();
        idioma = pagofinal.devuelveIdioma();
        if(pagofinal.devuelveSexo().equals("Hombre")){
            sexo = "Señor: ";
        }else{
            sexo = "Señora: ";
        }
        
    }
}
