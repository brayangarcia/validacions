/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Pago;
import controlador.Recoleccion;

/**
 *
 * @author USER
 */
public class PagoModelo {
    /**
     * Variable que guarda los datos de recoleccion
     */
    private Recoleccion recole;
    
    /**
     * Constructor de la clase que recibe una variable Recoleccion
     * @param recole 
     */
    public PagoModelo(Recoleccion recole) {
        this.recole = recole;
        //this.salario = 0;
        //pago = new Pago();
    }
    /**
     * Metodo que evalua los idiomas que habla y los envia en un String
     * @return 
     */
    public String devuelveIdioma(){
        String idiomas = "";
        for(int i=0; i<recole.getIdiomas().length;i++){
            if(Integer.parseInt(recole.getIdiomas()[i]) == 250000){
                idiomas += "Ingles"+", ";
            }else if(Integer.parseInt(recole.getIdiomas()[i]) == 330000){
                idiomas += "Frances"+", ";
            }else if(Integer.parseInt(recole.getIdiomas()[i]) == 500000){
                idiomas += "Aleman"+", ";
            }
        }
        return idiomas;
    }
    /**
     * Metodo que evalua el sexo y envia un String
     * @return 
     */
    public String devuelveSexo(){
        String sexo="";
        if(recole.getGenero().equals("Hombre")){
            sexo = "Hombre";
        }else{
            sexo= "Mujer";
        }
        return sexo;
    }
    
    /**
     * Metodo que evalua el salario total de la persona segun
     * los datos que agrego y envia el salario
     * @return 
     */
    public double envioSalario(){
        String[] idiomas;
        double salario=0;
        idiomas = recole.getIdiomas();
        if(recole.getDiasTrabajo()>0){
            if(recole.getProfesion().equals("Ingenieria")){
                salario = recole.getDiasTrabajo()*200000;
            }else if(recole.getProfesion().equals("Tecnologo")){
                salario = recole.getDiasTrabajo()*150000;
            }else if(recole.getProfesion().equals("Tecnico")){
                salario = recole.getDiasTrabajo()*100000;
            }else{
                salario = recole.getDiasTrabajo()*50000;
            }
            for(int i=0; i<idiomas.length; i++){
                salario = salario+Integer.parseInt(idiomas[i]);
            }
            if(recole.getUbicacion().equals("A fueras")){
                salario = salario+80000;
            }
            return salario;
        }else{
            return 0;
        }
            
    }
}
