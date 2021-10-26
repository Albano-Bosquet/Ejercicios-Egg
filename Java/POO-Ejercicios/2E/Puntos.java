/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2E;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Puntos {

    Scanner leer = new Scanner(System.in);
    private double x1, x2, y1, y2, distancia;

    //Setters
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    //Getters
    public double getDistancia() {
        return distancia;
    }

    //Metodos
    public void crearPuntos() {

        System.out.println("Ingrese la cordenada x para el punto 1");
        x1 = leer.nextInt();
        System.out.println("Ingrese la cordenada y para el punto 1");
        y1 = leer.nextInt();
        System.out.println("Ingrese la cordenada x para el punto 2");
        x2 = leer.nextInt();
        System.out.println("Ingrese la cordenada y para el punto 2");
        y2 = leer.nextInt();

    }

    public double distancia() {

        double xf, yf;
        xf = (Math.pow((x2 - x1), 2));
        yf = (Math.pow((y2 - y1), 2));
        distancia = (Math.sqrt(xf + yf));
        return distancia;

    }

}
