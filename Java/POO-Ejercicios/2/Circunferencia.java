/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author blackstrack
 */
public class Circunferencia {

    private double radio;
    public double area;
    public double perimetro;

    public Circunferencia() {
    }
    
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double area(){
        this.area = (3.14 * radio);
        return area;
    }
    
    public double perimetro(){
        this.perimetro = (2 * 3.14 * radio);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area() + ", perimetro=" + perimetro() + '}';
    }
    
}
