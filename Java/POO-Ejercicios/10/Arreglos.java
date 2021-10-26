/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Arrays;

/**
 *
 * @author blackstrack
 */
public class Arreglos {

    private double[] arreglo1 = new double[50];
    private double[] arreglo2 = new double[20];

    //Constructores
    public Arreglos() {
    }

    public Arreglos(double[] arreglo1, double[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    //Setters
    public void setArreglo1(double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public void setArreglo2(double[] arreglo2) {
        this.arreglo2 = arreglo2;
    }

    //Getters
    public double[] getArreglo1() {
        return arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    //Metodos
    public void arreglo1() {

        for (int i = 0; i <= 49; i++) {

            arreglo1[i] = ((double) (Math.random() * 10));
            System.out.print(arreglo1[i] + ", ");

        }
        System.out.println("");

        Arrays.sort(arreglo1);
        System.out.print("Arreglo de forma decendente: ");
        System.out.println(Arrays.toString(arreglo1));

    }

    public void arreglo2() {

        for (int i = 0; i <= 19; i++) {
            
            if(i < 10){
                arreglo2[i] = arreglo1[i];
            } else {
                arreglo2[i] = 0.5;
            }

        }
        
        for (int i = 0; i <= 19; i++){
            
            System.out.print(arreglo2[i] + ", ");
            
        }

    }

}
