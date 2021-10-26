/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5E;

import java.util.Scanner;

/**
 *
 * @author blackstrack
 */
public class Arrays {
    
    Scanner leer = new Scanner(System.in);
    private String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    //Constructores
    public Arrays() {
    }

    public Arrays(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    //Setters
    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    //Getters
    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    //Metodos
    public void mesSecreto(){
        
        mesSecreto = meses[(int)(Math.random()*12)];
        System.out.println("El mes secreto es " + mesSecreto);
        
    }
    
    public void adivinar(){
        
        String mes;
        do{
            
            System.out.println("Adivine el mes");
            mes = leer.next().toLowerCase();
            if(!(mes.equals(mesSecreto))){
                System.out.println("Incorrecto, intente nuevamente");
            } else {
                System.out.println("Acertaste!");
            }
            
        } while (!(mes.equals(mesSecreto)));
        
    }
    
}
