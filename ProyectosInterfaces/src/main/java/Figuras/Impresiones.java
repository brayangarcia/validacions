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
 * @author ISAACELEAZAR
 */
public class Impresiones {
        
    public Impresiones(){
        List<Figuras> listaFiguras = new ArrayList<>();
        Figuras fig;
        Scanner sd = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int respuesta;
        int x,y,altura,lado3, z;        
        do{
            System.out.println("Digite el número de la figura que desea ingresar: \n FIGURAS 2D: \n 1.Cuadrado \n 2. Triangulo \n 3. Circulo \n \n FIGURAS 3D: \n 4. Piramide \n 5. Cubo \n 6. Esfera \n Para salir digite otro número.");
            respuesta = in.nextInt();
            switch(respuesta){
                case 1:                    
                    System.out.println("CUADRADO");
                    System.out.println("Ingrese el lado 1:");
                    x = in.nextInt();
                    System.out.println("Ingrese el lado 2");
                    y = in.nextInt();                    
                    fig = new Cuadrado2D(x,y);
                    listaFiguras.add(fig);
                    break;
                case 2:
                    System.out.println("TRIANGULO");                    
                    System.out.println("Ingrese el lado 1:");
                    x = in.nextInt();
                    System.out.println("Ingrese el lado 2:");
                    y = in.nextInt();
                    System.out.println("Ingrese el lado 3:");
                    lado3 = in.nextInt();
                    fig = new Triangulo2D(lado3,x,y);
                    listaFiguras.add(fig);
                    break;
                case 3:
                    System.out.println("CIRCULO");
                    System.out.println("Ingrese el radio del circulo:");
                    x = in.nextInt();
                    fig = new Circulo2D(x);
                    listaFiguras.add(fig);
                    break;
                case 4:
                    System.out.println("PIRAMIDE");
                    System.out.println("Ingrese el tamaño de la base:");
                    x = in.nextInt();
                    System.out.println("Ingrese la altura :");
                    y = in.nextInt();
                    System.out.println("Ingrese el tamaño del apotema :");
                    z = in.nextInt();
                    fig = new Triangulo3D(x,y,z);                    
                    listaFiguras.add(fig);
                    break;                   
                case 5:
                    System.out.println("CUBO");
                    System.out.println("Ingrese el tamaño del lado:");
                    x = in.nextInt();
                    fig = new Cuadrado3D(x);
                    listaFiguras.add(fig);
                    break;
                case 6:
                    System.out.println("ESFERA");
                    System.out.println("Ingrese el radio de la esfera:");
                    x = in.nextInt();
                    fig = new Circulo3D(x);
                    listaFiguras.add(fig);
                    break;
                default:
                    break;                  
            }            
        }while(respuesta>0 && respuesta<7);
        
        for (Figuras listaFigura : listaFiguras) {
            if(listaFigura instanceof Cuadrado2D){
                System.out.println("CUADRADO");
                Cuadrado2D cuadrado = (Cuadrado2D) listaFigura;                
                System.out.println("Área de este " + cuadrado.getTipo() + ":" + listaFigura.getArea() + "\n Perímetro :" + cuadrado.getPerimetro());
            }
            if(listaFigura instanceof Triangulo2D){
                System.out.println("TRIANGULO");
                Triangulo2D triangulo = (Triangulo2D) listaFigura;
                System.out.println("Area de este triangulo: "+listaFigura.getArea() + " \n Tipo de triángulo " +triangulo.getTipo() + "\n Perimetro del triangulo:" + triangulo.getPerimetro());
            }
            if(listaFigura instanceof Circulo2D){
                System.out.println("CIRCULO");
                Circulo2D circulo = (Circulo2D) listaFigura;
                System.out.println("Area de este circulo: "+ listaFigura.getArea() + "\n Perimetro del circulo: " + circulo.getPerimetro());
            }
            if(listaFigura instanceof Cuadrado3D){
                System.out.println("CUBO");
                Cuadrado3D cuadrado = (Cuadrado3D) listaFigura;                
                System.out.println("Área de este " + "" + ":" + listaFigura.getArea() + "\n Volumen :" +cuadrado.getVolumen());
            }
            if(listaFigura instanceof Triangulo3D){
                System.out.println("PIRAMIDE");
                Triangulo3D triangulo = (Triangulo3D) listaFigura;                
                System.out.println("Área de esta piramide" + ":" + listaFigura.getArea() + "\n Volumen :" + triangulo.getVolumen());
            }
            if(listaFigura instanceof Circulo3D){
                System.out.println("ESFERA");
                Circulo3D circulo = (Circulo3D) listaFigura;                
                System.out.println("Área de este circulo"+ ":" + listaFigura.getArea() + "\n Volumen :" + circulo.getVolumen());
            }
        }
        
    }
    
    
}
