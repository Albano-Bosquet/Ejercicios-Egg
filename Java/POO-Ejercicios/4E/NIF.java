/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4E;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class NIF {

    Scanner leer = new Scanner(System.in);
    String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    private long DNI;
    private String letra;

    //Constructores
    public NIF() {

    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    //Setters
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    //Getters
    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    //Metodos
    public void crearNif() {

        double calc;
        System.out.println("Ingrese DNI");
        DNI = leer.nextLong();
        calc = (DNI % 23);
        for (int i = 0; i <= 21; i++) {
            if (calc == i) {
                letra = vector[i];
            }
        }

    }
    
    public void mostrarNif(){
        
        System.out.println("NIF: " + DNI + "-" + letra);
        
    }

}
