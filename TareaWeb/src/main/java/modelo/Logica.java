/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class Logica {
    
    public String validar(String vacio, String tamano,String valores,String correo,String fecha,String moneda){
        if(vacios(vacio,tamano,valores,correo,fecha,moneda)){
            if(validarTamano(tamano)){
                if(validarValores(valores)){
                    if(validarCorreo(correo)){
                        if(validarFecha(fecha)){
                            if(validarMoneda(moneda)){
                                
                            }else{
                                return "Moneda invalida.";
                            }
                        }else{
                            return "Fecha invalida.";
                        }
                    }else{
                        return "Correo invalido.";
                    }
                }else{
                    return "Valores invalidos.";
                }
            }else{
                return "Tamaño invalido.";
            }
        }else{
            return "Diligencie todos los datos.";
        }
        return "Registro exitoso";
    }
    
    public boolean vacios(String vacio, String tamaño,String valores,String correo,String fecha,String moneda){
        
        //return !(vacio.length()==0 || tamaño.length()==0 || valores.length()==0 || correo.length()==0 || fecha.length()==0 || moneda.length()==0); 
        try{
            //if(vacio.length()==0 || tamaño.length()==0 || valores.length()==0 || correo.length()==0 || fecha.length()==0 || moneda.length()==0){
                //return false;
            //}
            if(vacio.equals("")|| tamaño.equals("") || valores.equals("") || correo.equals("") || fecha.equals("") || moneda.equals("")){
                return false;
            }else{
                
            }
        
        }catch(Exception e){
            if(e.getMessage().equals("NullPointerException")){
                return false;
            }
        } 
        return true;
    }
    
    public boolean validarTamano(String tamano){
        if(tamano.length() >=5 && tamano.length()<=20){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarValores(String valores){
        if(Integer.parseInt(valores)>=0 && Integer.parseInt(valores)<=50){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarCorreo(String correo){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarFecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public boolean validarMoneda(String moneda){
        if(moneda.charAt(0) != '$'){
            return false;
        }else{
            return true;
        }
    }
}
