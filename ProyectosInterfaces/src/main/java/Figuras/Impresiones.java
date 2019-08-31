/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Impresiones {
        
    public Impresiones(){
        List<Figuras> listaFiguras = new ArrayList<>();
        Figuras fig;
        Scanner sd = new Scanner(System.in);
        int respuesta;
        int x,y,altura,lado3;
        String tipo;
        do{
            System.out.println("Digite el número de la figura que desea ingresar: \n FIGURAS 2D: \n 1.Cuadrado \n 2. Triangulo \n 3. Circulo \n \n FIGURAS 3D: \n 4. Piramide \n 5. Cubo \n 6. Esfera");
            respuesta = sd.nextInt();
            switch(respuesta){
                case 1:                    
                    System.out.println("Ingrese el lado 1:");
                    x = sd.nextInt();
                    System.out.println("Ingrese el lado 2");
                    y = sd.nextInt();
                    System.out.println("Ingrese si es cuadrado o rectangulo");
                    tipo = sd.next();
                    //fig= new Cuadrado(x,y,tipo);
                    break;
            }
        }while(respuesta<1 && respuesta>6);
        
    }
    
    
}
