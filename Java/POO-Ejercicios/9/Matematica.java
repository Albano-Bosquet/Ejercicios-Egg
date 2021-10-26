/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author blackstrack
 */
public class Matematica {

    private double num1, num2, mayor, menor, potencia, raiz;

    //Constructores
    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //Metodos
    public void devolverMayor() {

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        
        if (num1 < num2){
            menor = num1;
        } else {
            menor = num2;
        }
        
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
    }
    

    public double calcularPotencia() {
        
        menor = (Math.round(menor));
        System.out.println("El menor numero redondeado es: " + menor);
        mayor = (Math.round(mayor));
        System.out.println("El mayor numero redondeado es: " + mayor);
        potencia = (Math.pow(menor, mayor));
        System.out.println("La potencia del mayor numero elevado al menor es de " + potencia);
        return potencia;

    }
    
    public double calcularRaiz(){
        
        raiz = Math.sqrt(menor);
        System.out.println("La raiz del menor numero es de: " + raiz);
        return raiz;
        
    }

}
