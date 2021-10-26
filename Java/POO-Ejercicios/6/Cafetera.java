/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Cafetera {
    
    Scanner leer = new Scanner(System.in);
    private int CapacidadMaxima;
    private int CantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadmaxima, int capacidadactual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    //Setters
    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    //Getters
    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    //Metodos
    public void llenarCafetera() {
        CantidadActual = CapacidadMaxima;
        System.out.println("La cantidad actual de la cafetera es " + CantidadActual);
    }
    
    public void servirTaza(){
        int size;
        System.out.println("De que tamaño es la taza?(1, 2 o 3)");
        size = leer.nextInt();
        if(size > CantidadActual){
            System.out.println("La taza no se lleno, quedo en " + CantidadActual);
            CantidadActual = 0;
        } else {
            CantidadActual = (CantidadActual - size);
            System.out.println("La taza se ha llenado y la cafetera tiene " + CantidadActual + " de cafe");
        }
    }
    
    public void vaciarCafetera(){
        CantidadActual = 0;
        System.out.println("La cantidad de cafe que tiene la cafetera es " + CantidadActual);
    }
    
    public void agregar(){
        int cantidad;
        System.out.println("Cuanto cafe desea agregar a la cafetera?");
        cantidad = leer.nextInt();
        if((cantidad + CantidadActual) > CapacidadMaxima){
            CantidadActual = CapacidadMaxima;
            System.out.println("La cantidad a agregar supera a la cantidad maxima, se relleno la cafetera");
        } else {
            CantidadActual = (CantidadActual + cantidad);
            System.out.println("La cafetera tiene " + CantidadActual + " de cafe");
        }
    }
}
