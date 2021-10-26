/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3E;

/**
 *
 * @author blackstrack
 */
public class Raices {

    private int a, b, c, discriminante;

    //Constructores
    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Setters
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    //Getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    //Metodos
    public int getDiscriminante(){
        
        discriminante = (int)((Math.pow(b, 2)) - 4 * a * c);
        System.out.println("El discriminante es " + discriminante);
        return discriminante;
        
    }
    
    public void tieneRaices(){
        boolean raices;
        raices = discriminante >= 0;
        System.out.println(raices);
    }
    
}
